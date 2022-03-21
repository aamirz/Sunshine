package com.example.sunshine.data

import com.example.sunshine.model.WeatherModel
import kotlinx.coroutines.flow.Flow

interface WeatherRepository {
    suspend fun getWeather(): List<WeatherModel>
}
