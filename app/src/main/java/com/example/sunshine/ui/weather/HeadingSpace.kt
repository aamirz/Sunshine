package com.example.sunshine.ui.weather

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.dp
import com.example.sunshine.R

@Composable
fun HeadingSpace() {
    Spacer(
        modifier = Modifier
            .height(dimensionResource(id = R.dimen.forecast_padding_large))
            .fillMaxWidth()
    )
}