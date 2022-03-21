package com.example.sunshine.ui.weather

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.unit.dp
import com.example.sunshine.ui.theme.BlueGradientDark
import com.example.sunshine.ui.theme.BlueGradientLight

@Composable
fun TodayWeatherHeading() {
    Row(
        modifier = Modifier.fillMaxWidth()
                // todo remove fake height
            .height(150.dp)
            .background(
                brush = Brush.horizontalGradient(
                    colors = listOf(BlueGradientDark, BlueGradientLight),
                    tileMode = TileMode.Repeated
                )
            ),
        horizontalArrangement = Arrangement.Center
    ) {
        TitleText()
        // todo add values
        // subtitle
        // tempterature
        // feels like text
    }
}

@Composable
fun TitleText() {
    Text("Atlanta, GA",
        color = Color.White)
}