package com.example.sunshine.data.impl

import com.example.sunshine.data.Weather.WeatherResponse
import com.example.sunshine.data.WeatherRepository
import com.example.sunshine.model.OpenWeatherImpl.OpenWeatherAPIIconKey
import com.example.sunshine.model.WeatherModel
import com.example.sunshine.network.WeatherApi
import com.example.sunshine.network.utils.RetrofitHelper
import com.example.sunshine.ui.utils.toDegreeString
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.text.SimpleDateFormat
import java.util.*

class OpenAPIWeatherRepository: WeatherRepository {

    private val weatherAPI: WeatherApi = RetrofitHelper.getInstance().create(WeatherApi::class.java)

    // for now fail silently
    override suspend fun getWeather(): List<WeatherModel> {
        return withContext(Dispatchers.IO) {
            val result = weatherAPI.getForecast()
            val response: WeatherResponse? = result.body()
            val returnValue = mutableListOf<WeatherModel>()
            response?.let {
                if (it.cod == 200) {
                    translateResponse(it, returnValue)
                }
            }
            returnValue
        }
    }

    private fun translateResponse(it: WeatherResponse, returnValue: MutableList<WeatherModel>) {
        for (data in it.list) {
            val day = getDayOfWeek(data.dt)
            val weatherData = data.weather.firstOrNull()
            val weather = weatherData?.description?.replaceFirstChar {
                if (it.isLowerCase()) it.titlecase(
                    Locale.ENGLISH
                ) else it.toString()
            }
                ?: ""
            val icon = OpenWeatherAPIIconKey(weatherData?.icon ?: "")
            val humidity = "Humidity: ${data.humidity}%"
            val pressure = "Pressure: ${data.pressure} hPa"
            val wind = "Wind: ${data.speed.toInt()} khm/h ${data.deg.getDirection()}"
            val highTemp = data.temp.max.toInt().toString().toDegreeString()
            val lowTemp = data.temp.min.toInt().toString().toDegreeString()
            returnValue.add(
                WeatherModel(
                    day = day,
                    weather = weather,
                    icon = icon,
                    humidity = humidity,
                    pressure = pressure,
                    wind = wind,
                    highTemperature = highTemp,
                    lowTemperature = lowTemp
                )
            )
        }
    }

    private fun getDayOfWeek(timestamp: Long): String {
        return SimpleDateFormat("EEEE", Locale.ENGLISH).format(timestamp * 1000)
    }

    private fun Int.getDirection() : String {
        // todo convert direction degrees to String
        return "NW"
    }
}