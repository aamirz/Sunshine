package com.example.sunshine

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.example.sunshine.ui.theme.SunshineTheme

@Composable
fun SunshineApp() {
 SunshineTheme {
  Scaffold(
   topBar = { SunshineTopBar() }
  ) {

  }
 }
}
