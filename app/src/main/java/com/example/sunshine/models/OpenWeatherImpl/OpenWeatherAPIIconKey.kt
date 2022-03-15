package com.example.sunshine.models.OpenWeatherImpl

import com.example.sunshine.models.APIIconKey

private val validCodes = setOf(
    "11d",
    "09d",
    "10d",
    "13d",
    "50d",
    "01d",
    "01n",
    "02d",
    "02n"
)

class OpenWeatherAPIIconKey(inputKeyValue: String) : APIIconKey(inputKeyValue = inputKeyValue,
    validCodes = validCodes)