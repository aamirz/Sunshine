package com.example.sunshine.ui.weather.WeatherCard

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.sunshine.ui.theme.Blue034
import com.example.sunshine.ui.theme.openSansRegular
import com.example.sunshine.ui.utils.toDegreeString

@Composable
fun DailyHighText(highTemperature: String) {
    Text(text = highTemperature,
        fontFamily = openSansRegular(),
        fontWeight = FontWeight.Normal,
        color = Blue034,
        fontSize = 14.sp
    )
}

@Preview
@Composable
fun PreviewDailyHighText() {
    DailyHighText(highTemperature = "7".toDegreeString())
    
}
