package com.example.sunshine.data.impl

import com.example.sunshine.data.WeatherRepository
import com.example.sunshine.model.WeatherModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext

class StubWeatherRepository: WeatherRepository {

    override suspend fun getWeather(): List<WeatherModel> {
       return withContext(Dispatchers.IO) {
           delay(300L)
            val models = mutableListOf<WeatherModel>()
           for (i in 0 until 10) {
               models.add(WeatherModel())
           }
           models
        }
    }

}
