package com.example.sunshine.ui.home

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.sunshine.ui.weather.ForecastTitle
import com.example.sunshine.ui.weather.FutureWeatherList
import com.example.sunshine.ui.weather.TodayWeatherHeading

@Composable
fun PageContent() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TodayWeatherHeading()
        ForecastTitle()
        FutureWeatherList()
    }
}

