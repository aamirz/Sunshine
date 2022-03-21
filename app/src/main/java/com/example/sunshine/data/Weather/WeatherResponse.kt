package com.example.sunshine.data.Weather

data class WeatherResponse(val cod: Int,
                           val count: Int,
                           val city: CityData,
                           val list: List<DayData>)

data class CityData(val name: String, val country: String)

data class DayData(
    val dt: Long,
    val temp: TemperatureData,
    val feels_like: FeelsLikeData,
    val pressure: Int,
    val humidity: Int,
    val weather: List<WeatherData>,
    val speed: Float,
    val deg: Int
)

data class WeatherData(
    val id: Int,
    val main: String,
    val description: String,
    val icon: String
)

data class FeelsLikeData(val day: Float, val night: Float, val eve: Float, val morn: Float)

data class TemperatureData(val min: Float, val max: Float)

