package com.example.sunshine.ui.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.unit.dp
import com.example.sunshine.models.WeatherModel
import com.example.sunshine.ui.theme.BlueGradientDark
import com.example.sunshine.ui.theme.BlueGradientLight

@Composable
fun MainPage(models: List<WeatherModel>) {
    Scaffold(
        topBar = {
            TopSunshineBar()

        }
    ) {
        PageContent(models)
    }
}
