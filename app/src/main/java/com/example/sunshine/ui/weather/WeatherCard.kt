package com.example.sunshine.ui.weather

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sunshine.models.WeatherModel

@Composable
fun WeatherCard(model: WeatherModel) {
    Surface(modifier = Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(horizontal = 4.dp)
        ) {
            Text(model.day)
        }
    }
}

@Preview 
@Composable
fun PreviewWeatherCard() {
    WeatherCard(model = WeatherModel())
}