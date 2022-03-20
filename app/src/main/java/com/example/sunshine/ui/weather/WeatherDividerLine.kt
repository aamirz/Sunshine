package com.example.sunshine.ui.weather

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sunshine.ui.theme.Gray8E9

@Composable
fun WeatherDividerLine() {
    Row(
        modifier = Modifier.fillMaxWidth()
            .padding(horizontal = 8.dp)
    ) {
        Divider(
            modifier = Modifier.fillMaxWidth(),
            color = Gray8E9,
            thickness = 1.dp,
        )
    }
}

@Preview
@Composable
fun PreviewWeatherDividerLine() {
    WeatherDividerLine()
}