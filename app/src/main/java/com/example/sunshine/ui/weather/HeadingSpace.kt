package com.example.sunshine.ui.weather

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HeadingSpace() {
    Spacer(
        modifier = Modifier
            .height(16.dp)
            .fillMaxWidth()
    )
}