package com.example.sunshine.ui.weather.WeatherCard

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.sunshine.model.WeatherModel

@Composable
fun HiddenCardValueContainer(model: WeatherModel) {
    Column() {
        HiddenCardValues(model)
        CardContentSeparation()
    }
}

@Preview
@Composable
fun PreviewHiddenCardValueContainer() {
    HiddenCardValueContainer(model = WeatherModel())
}