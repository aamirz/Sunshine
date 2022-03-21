package com.example.sunshine.ui.weather.WeatherCard

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.sunshine.R
import com.example.sunshine.ui.theme.Gray7A2
import com.example.sunshine.ui.theme.openSansRegular

@Composable
fun WeatherInfoText(text: String) {
    Text(text = text,
        fontSize = 12.sp,
        fontFamily = openSansRegular(),
        fontWeight = FontWeight.Normal,
        color = Gray7A2)
}

@Preview
@Composable
fun PreviewWeatherInfoText() {
    WeatherInfoText(text = "Sunny")
}