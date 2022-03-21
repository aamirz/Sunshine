package com.example.sunshine.model

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.example.sunshine.model.OpenWeatherImpl.OpenWeatherAPIIconKey

data class WeatherModel(val day: String = "Saturday",
                        val weather: String = "Cloudy",
                        val icon: OpenWeatherAPIIconKey = OpenWeatherAPIIconKey(),
                        val humidity: String = "Humidity: 81%",
                        val pressure: String = "Pressure: 1017 hPa",
                        val wind: String = "Wind: 2 km/h NW",
                        val highTemperature: String = "70",
                        val lowTemperature: String = "56"
) {
   val cardState: MutableState<CardState> = mutableStateOf(CardState.Collapsed)
}