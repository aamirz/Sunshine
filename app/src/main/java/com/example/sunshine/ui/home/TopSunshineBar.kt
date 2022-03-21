package com.example.sunshine.ui.home

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sunshine.R
import com.example.sunshine.ui.theme.Blue034
import com.example.sunshine.ui.theme.openSansBold
import com.example.sunshine.ui.theme.openSansExtraBold

@Composable
fun TopSunshineBar() {
    TopAppBar(backgroundColor = Color.White, elevation = 0.dp) {
        Icon(
            painter = painterResource(id = R.drawable.ic_menu),
            contentDescription = "An icon with three horizontal strokes."
        )

        Spacer(
            modifier = Modifier
                .fillMaxHeight()
                .width(dimensionResource(id = R.dimen.forecast_padding_medium))
        )

        Text(
            "Sunshine",
            fontFamily = openSansExtraBold(),
            fontWeight = FontWeight.ExtraBold,
            fontSize = 18.sp,
            color = Blue034
        )
    }
}