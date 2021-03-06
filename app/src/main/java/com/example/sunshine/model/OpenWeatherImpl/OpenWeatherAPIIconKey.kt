package com.example.sunshine.model.OpenWeatherImpl

import com.example.sunshine.model.APIIconKey

private val validCodes = setOf(
    "11d",
    "09d",
    "10d",
    "13d",
    "50d",
    "01d",
    "01n",
    "02d",
    "02n",
    "04d",
    "04n",
    "03d",
    "03n"
)

class OpenWeatherAPIIconKey(inputKeyValue: String = validCodes.first()) : APIIconKey(inputKeyValue = inputKeyValue,
    validCodes = validCodes)
