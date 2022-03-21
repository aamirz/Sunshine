package com.example.sunshine.ui.weather.WeatherCard

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import com.example.sunshine.R

@Composable
fun CardContentSeparation() {
    Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.forecast_padding_medium)))
}