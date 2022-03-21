package com.example.sunshine

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import com.example.sunshine.model.WeatherModel
import com.example.sunshine.ui.home.MainPage
import com.example.sunshine.ui.theme.SunshineTheme

@Composable
fun SunshineApp(weatherModels: List<WeatherModel>) {
 SunshineTheme {
     MainPage(weatherModels)
 }
}



