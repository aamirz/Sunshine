package com.example.sunshine.ui.home

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sunshine.models.WeatherModel
import com.example.sunshine.ui.weather.*

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PageContent() {
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

        val models = mutableListOf<WeatherModel>()
        for (i in 0 until 10) {
            models.add(WeatherModel())
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
    Spacer(modifier = Modifier.fillMaxWidth().height(80.dp))
}

@Composable
private fun CardSpace() {
    Spacer(modifier = Modifier
        .fillMaxWidth()
        .height(8.dp)
    )
}

@Preview
@Composable
fun PreviewPageContent() {
    PageContent()
}

