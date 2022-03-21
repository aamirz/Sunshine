package com.example.sunshine.ui.weather.WeatherCard

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import com.example.sunshine.R
import com.example.sunshine.model.WeatherModel

@Composable
fun IconTitle(model: WeatherModel) {
    Row() {
        WeatherIcon(model.icon)
        Spacer(modifier = Modifier.width(dimensionResource(id = R.dimen.forecast_padding_small)))
        WeatherTitle(model)
    }
}