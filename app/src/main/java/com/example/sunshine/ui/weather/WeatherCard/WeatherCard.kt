package com.example.sunshine.ui.weather

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.res.dimensionResource
import com.example.sunshine.R
import com.example.sunshine.models.CardState
import com.example.sunshine.models.WeatherModel
import com.example.sunshine.ui.weather.WeatherCard.*

@OptIn(ExperimentalAnimationApi::class, androidx.compose.material.ExperimentalMaterialApi::class)
@Composable
fun WeatherCard(model: WeatherModel) {
    Surface(modifier = Modifier.fillMaxWidth(),
    onClick = {
        model.cardState.value = if (model.cardState.value == CardState.Collapsed) CardState.Expanded else CardState.Collapsed
    }) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = dimensionResource(id = R.dimen.weather_card_horizontal_padding)),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            IconTitle(model)
            CardTemperature(model.highTemperature, model.lowTemperature)
        }
    }
}


@Preview
@Composable
fun PreviewWeatherCard() {
    WeatherCard(model = WeatherModel())
}
