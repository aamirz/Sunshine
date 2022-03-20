package com.example.sunshine.ui.weather

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sunshine.R
import com.example.sunshine.ui.theme.Blue034

@Composable
fun ForecastTitle(titleText: String = "10-Day Forecast") {
    val fontFamily = FontFamily(
        Font(R.font.open_sans_bold),
    )
    Row(horizontalArrangement = Arrangement.Start,
        modifier = Modifier.fillMaxWidth()) {
        Text(
            titleText,
            fontSize = 16.sp,
            color = Blue034,
            fontFamily = fontFamily
        )
    }
}

@Preview
@Composable
fun ForecastTitlePreview() {
    ForecastTitle()
}