package com.example.sunshine

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.getValue
import com.example.sunshine.viewmodel.ForecastViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // WindowCompat.setDecorFitsSystemWindows(window, false)
        val forecaseViewModel by viewModels<ForecastViewModel>()
        forecaseViewModel.loadWeather()
        setContent {
            val models by rememberSaveable {
                forecaseViewModel.weatherModels
            }
           SunshineApp(models)
        }
    }
}
