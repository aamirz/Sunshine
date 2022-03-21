package com.example.sunshine.ui.weather.WeatherCard

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.example.sunshine.models.WeatherModel

@Composable
fun HiddenCardValues(model: WeatherModel) {
    Column {
        WeatherInfoText(text = model.humidity)
        TextHorizontalSpace()
        WeatherInfoText(text = model.pressure)
        TextHorizontalSpace()
        WeatherInfoText(text = model.wind)
    }
}