package com.example.sunshine.ui.weather.WeatherCard

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import com.example.sunshine.models.CardState
import com.example.sunshine.models.WeatherModel

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun WeatherTitle(model: WeatherModel) {
    val cardState by rememberSaveable() {
        model.cardState
    }
    Column() {
        DayText(model.day)
        TextHorizontalSpace()
        WeatherInfoText(model.weather)
        CardContentSeparation()
        AnimatedVisibility(visible = cardState == CardState.Expanded) {
            HiddenCardValueContainer(model)
        }
    }
}

@Preview
@Composable
fun PreviewWeatherTitle() {
    WeatherTitle(model = WeatherModel())
}