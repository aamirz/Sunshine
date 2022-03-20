package com.example.sunshine.ui.weather

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sunshine.models.WeatherModel

@Composable
fun FutureWeatherList() {
    val models = mutableListOf<WeatherModel>()
    for (i in 0 until 10) {
        models.add(WeatherModel())
    }

    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        itemsIndexed(models) { index, model ->
            HeadingSpace()

            WeatherCard(model)

            if (index < models.lastIndex) {
                CardSpace()
                WeatherDividerLine()
            }
        }
    }
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
fun PreviewFutureWeatherList() {
    FutureWeatherList()
}

