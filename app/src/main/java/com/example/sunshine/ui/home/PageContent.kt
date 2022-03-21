package com.example.sunshine.ui.home

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.sunshine.R
import com.example.sunshine.models.WeatherModel
import com.example.sunshine.ui.weather.*

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PageContent(models: List<WeatherModel>) {
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            TodayWeatherHeading()
        }

        item {
            HeadingSpace()
        }

        stickyHeader {
            ForecastTitle()
        }

        itemsIndexed(models) { index, model ->
            HeadingSpace()

            WeatherCard(model)

            if (index < models.lastIndex) {
                CardSpace()
                WeatherDividerLine()
            }
        }

        item() {
            EmptyCard()
        }
    }
}


@Composable
private fun EmptyCard() {
    Spacer(modifier = Modifier
        .fillMaxWidth()
        .height(dimensionResource(id = R.dimen.weather_card_empty_height)))
}

@Composable
private fun CardSpace() {
    Spacer(modifier = Modifier
        .fillMaxWidth()
        .height(dimensionResource(id = R.dimen.forecast_padding_medium))
    )
}

@Preview
@Composable
fun PreviewPageContent() {
    // todo use stub model repository instead
    val models = mutableListOf<WeatherModel>()
    for (i in 0 until 10) {
        models.add(WeatherModel())
    }
    PageContent(models)
}

