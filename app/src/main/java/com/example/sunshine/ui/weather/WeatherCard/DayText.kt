package com.example.sunshine.ui.weather.WeatherCard

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposeCompilerApi
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.sunshine.R
import com.example.sunshine.ui.theme.Blue034
import com.example.sunshine.ui.theme.openSansBold
import com.example.sunshine.ui.theme.openSansRegular

@Composable
fun DayText(day: String) {
    Text(day,
        fontSize = 14.sp,
        fontFamily = openSansBold(),
        color = Blue034,
        fontWeight = FontWeight.Bold
    )
}

@Preview
@Composable
fun PreviewDayText() {
    DayText(day = "Monday")
}