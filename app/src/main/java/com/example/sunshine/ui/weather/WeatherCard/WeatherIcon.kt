package com.example.sunshine.ui.weather.WeatherCard

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import com.example.sunshine.R
import com.example.sunshine.models.OpenWeatherImpl.OpenWeatherAPIIconKey
import com.example.sunshine.ui.theme.Blue034
import com.example.sunshine.ui.utils.OpenWeatherIconMapper

@Composable
fun WeatherIcon(icon: OpenWeatherAPIIconKey) {
    Box(modifier = Modifier.size(dimensionResource(id = R.dimen.weather_card_icon_size))) {
        Icon(
            painter = painterResource(id = OpenWeatherIconMapper.getIcon(icon)),
            contentDescription = "An icon with three horizontal strokes.",
            tint = Blue034
        )
    }
}