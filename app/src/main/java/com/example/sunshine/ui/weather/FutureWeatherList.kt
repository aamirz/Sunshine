package com.example.sunshine.ui.weather

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.sunshine.models.WeatherModel

@Composable
fun FutureWeatherList() {
    val models = mutableListOf<WeatherModel>()
    for (i in 0 until 10) {
        models.add(WeatherModel())
    }

    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        items(models) { model ->
            WeatherCard(model)
        }
    }
}