package com.example.sunshine.ui.binding

import com.example.sunshine.R

/**
 * The OpenWeatherIconMapper provides icon bindings
 * for the open weather map API.
 */
object OpenWeatherIconMapper: IconMapper {

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

    private val smallIconMap = mapOf(
        "11d" to R.drawable.ic_weather_stormy_small,
        "09d" to R.drawable.ic_weather_rainy_small,
        "10d" to R.drawable.ic_weather_rainy_2_small,
        "13d" to R.drawable.ic_weather_rainy_2_small,
        "50d" to R.drawable.ic_weather_sunny_small,
        "01d" to R.drawable.ic_weather_sunny_small,
        "01n" to R.drawable.ic_weather_moon_small,
        "02d" to R.drawable.ic_weather_cloudy_small,
        "02n" to R.drawable.ic_weather_cloudy_night_small
    )

    //endregion

    //region IconMapper overrides
    override fun getIcon(apiIconKey: APIIconKey): Int {
       return getOrDefaultIcon(apiIconKey = apiIconKey, iconMap)
    }

    override fun getSmallIcon(apiIconKey: APIIconKey): Int {
        return getOrDefaultIcon(apiIconKey = apiIconKey, smallIconMap)
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