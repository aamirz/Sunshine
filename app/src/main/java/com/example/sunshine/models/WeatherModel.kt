package com.example.sunshine.models

import com.example.sunshine.models.OpenWeatherImpl.OpenWeatherAPIIconKey

data class WeatherModel(val day: String = "Saturday",
                        val weather: String = "Cloudy",
                        val icon: OpenWeatherAPIIconKey = OpenWeatherAPIIconKey(),
                        val humidity: String = "Humidity: 81%",
                        val pressure: String = "Pressure: 1017 hPa",
                        val wind: String = "Wind: 2 km/h NW",
                        val highTemperature: String = "70",
                        val lowTemperature: String = "56"
)