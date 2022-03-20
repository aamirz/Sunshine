package com.example.sunshine.ui.home

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sunshine.ui.weather.ForecastTitle
import com.example.sunshine.ui.weather.FutureWeatherList
import com.example.sunshine.ui.weather.TodayWeatherHeading

@Composable
fun PageContent() {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TodayWeatherHeading()
        Column(modifier = Modifier.fillMaxWidth()
            .padding(horizontal = 4.dp)) {
            HeadingSpace()
            ForecastTitle()
            HeadingSpace()
            FutureWeatherList()
        }
    }
}

@Composable
fun HeadingSpace() {
   Spacer(modifier = Modifier
       .height(16.dp)
       .fillMaxWidth())
}

@Preview
@Composable
fun PreviewPageContent() {
    PageContent()
}

