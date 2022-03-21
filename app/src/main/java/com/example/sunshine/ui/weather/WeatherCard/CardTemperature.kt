package com.example.sunshine.ui.weather.WeatherCard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.sunshine.ui.utils.toDegreeString

@Composable
fun CardTemperature(highTemp: String, lowTemp: String) {
    Row(horizontalArrangement = Arrangement.End) {
        Column {
            DailyHighText(highTemperature = highTemp)
            TextHorizontalSpace()
            WeatherInfoText(text = lowTemp.toDegreeString())
        }
    }
}

@Preview
@Composable
fun PreviewCardTemperature() {
    CardTemperature("7", "0")
}
