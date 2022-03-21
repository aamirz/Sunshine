package com.example.sunshine.viewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.sunshine.data.impl.StubWeatherRepository
import com.example.sunshine.data.WeatherRepository
import com.example.sunshine.model.WeatherModel
import kotlinx.coroutines.launch

class ForecastViewModel: ViewModel() {

    private val _weatherModels: MutableState<List<WeatherModel>> = mutableStateOf(mutableListOf<WeatherModel>())
    val weatherModels: State<List<WeatherModel>>
    get() {
        return _weatherModels
    }

    private val weatherRepository: WeatherRepository = StubWeatherRepository()

    fun loadWeather() {
        viewModelScope.launch {
            _weatherModels.value = weatherRepository.getWeather()
        }
    }

}