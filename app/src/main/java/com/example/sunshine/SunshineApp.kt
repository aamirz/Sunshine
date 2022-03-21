package com.example.sunshine

import androidx.compose.runtime.Composable
import com.example.sunshine.models.WeatherModel
import com.example.sunshine.ui.home.MainPage
import com.example.sunshine.ui.theme.SunshineTheme

@Composable
fun SunshineApp() {
    val models = mutableListOf<WeatherModel>()
    for (i in 0 until 10) {
        models.add(WeatherModel())
    }
 SunshineTheme {
     MainPage(models)
 }
}



