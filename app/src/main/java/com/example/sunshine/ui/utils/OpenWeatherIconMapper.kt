package com.example.sunshine.ui.utils

import com.example.sunshine.R
import com.example.sunshine.models.APIIconKey

/**
 * The OpenWeatherIconMapper provides icon bindings
 * for the open weather map API.
 */
class OpenWeatherIconMapper: IconMapper {

    //region Private Properties
    private val iconMap = mapOf(
        "11d" to R.drawable.ic_weather_stormy,
        "09d" to R.drawable.ic_weather_rainy,
        "10d" to R.drawable.ic_weather_rainy_2,
        "13d" to R.drawable.ic_weather_rainy_2,
        "50d" to R.drawable.ic_weather_sunny,
        "01d" to R.drawable.ic_weather_sunny,
        "01n" to R.drawable.ic_weather_moon,
        "02d" to R.drawable.ic_weather_cloudy,
        "02n" to R.drawable.ic_weather_cloudy_night
    )

    //endregion

    //region IconMapper overrides
    override fun getIcon(apiIconKey: APIIconKey): Int {
       return getOrDefaultIcon(apiIconKey = apiIconKey, iconMap)
    }
    //endregion

    //region Private Methods
    private fun getOrDefaultIcon(apiIconKey: APIIconKey, map: Map<String, Int>): Int {
        // todo aaz slot in an empty icon here instead
        val default = R.drawable.ic_launcher_background
        return apiIconKey.keyValue?.let { key ->
            map.getOrElse(key, { default })
        } ?: default
    }
    //endregion
}