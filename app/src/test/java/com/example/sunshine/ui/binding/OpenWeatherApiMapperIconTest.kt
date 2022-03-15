package com.example.sunshine.ui.binding

import com.example.sunshine.R
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import kotlin.properties.Delegates

class OpenWeatherApiMapperIconTest {

    private var smallNightCloudyIcon by Delegates.notNull<Int>()
    private var smallCloudyIcon by Delegates.notNull<Int>()
    private var smallMoonIcon by Delegates.notNull<Int>()
    private var smallSunnyIcon by Delegates.notNull<Int>()
    private var smallRainy2Icon by Delegates.notNull<Int>()
    private var smallRainyIcon by Delegates.notNull<Int>()
    private var smallStormyIcon by Delegates.notNull<Int>()
    private var nightCloudyIcon by Delegates.notNull<Int>()
    private lateinit var nightCloudyCode: OpenWeatherAPIIconKey
    private var cloudyIcon by Delegates.notNull<Int>()
    private lateinit var cloudyCode: OpenWeatherAPIIconKey
    private var moonIcon by Delegates.notNull<Int>()
    private lateinit var moonCode: OpenWeatherAPIIconKey
    private var sunnyIcon by Delegates.notNull<Int>()
    private lateinit var sunnyCodeB: OpenWeatherAPIIconKey
    private lateinit var sunnyCodeA: OpenWeatherAPIIconKey
    private var rainy2Icon by Delegates.notNull<Int>()
    private var rainyIcon by Delegates.notNull<Int>()
    private var stormyIcon by Delegates.notNull<Int>()
    private lateinit var rainy2CodeB: OpenWeatherAPIIconKey
    private lateinit var rainy2CodeA: OpenWeatherAPIIconKey
    private lateinit var rainyCode: OpenWeatherAPIIconKey
    private lateinit var stormyCode: OpenWeatherAPIIconKey
    private lateinit var mapper: OpenWeatherIconMapper
    private lateinit var invalidKey: OpenWeatherAPIIconKey
    private var defaultIcon by Delegates.notNull<Int>()

    @Before
    fun setup() {
        mapper = OpenWeatherIconMapper()
        val invalidCode = "aaaaa"
        invalidKey = OpenWeatherAPIIconKey(invalidCode)
        defaultIcon = R.drawable.ic_launcher_background

        //region valid key codes
        stormyCode = OpenWeatherAPIIconKey("11d")
        rainyCode = OpenWeatherAPIIconKey("09d")
        rainy2CodeA = OpenWeatherAPIIconKey("10d")
        rainy2CodeB = OpenWeatherAPIIconKey("13d")
        sunnyCodeA = OpenWeatherAPIIconKey("50d")
        sunnyCodeB = OpenWeatherAPIIconKey("01d")
        moonCode = OpenWeatherAPIIconKey("01n")
        cloudyCode = OpenWeatherAPIIconKey("02d")
        nightCloudyCode = OpenWeatherAPIIconKey("02n")
        //endregion

        //region valid icons
        stormyIcon = R.drawable.ic_weather_stormy
        rainyIcon = R.drawable.ic_weather_rainy
        rainy2Icon = R.drawable.ic_weather_rainy_2
        sunnyIcon = R.drawable.ic_weather_sunny
        moonIcon = R.drawable.ic_weather_moon
        cloudyIcon = R.drawable.ic_weather_cloudy
        nightCloudyIcon = R.drawable.ic_weather_cloudy_night
        //endregion

        //region valid small icons
        smallStormyIcon = R.drawable.ic_weather_stormy_small
        smallRainyIcon = R.drawable.ic_weather_rainy_small
        smallRainy2Icon = R.drawable.ic_weather_rainy_2_small
        smallSunnyIcon = R.drawable.ic_weather_sunny_small
        smallMoonIcon = R.drawable.ic_weather_moon_small
        smallCloudyIcon = R.drawable.ic_weather_cloudy_small
        smallNightCloudyIcon = R.drawable.ic_weather_cloudy_night_small
        //endregion


    }

    //region Icon Tests
    @Test
    fun invalidKeyProducesDefaultIcon() {
        assertEquals(defaultIcon, mapper.getIcon(invalidKey))
    }

    @Test
    fun getIconProducesValidIcons() {
        assertEquals(stormyIcon, mapper.getIcon(stormyCode))
        assertEquals(rainyIcon, mapper.getIcon(rainyCode))
        assertEquals(rainy2Icon, mapper.getIcon(rainy2CodeA))
        assertEquals(rainy2Icon, mapper.getIcon(rainy2CodeB))
        assertEquals(sunnyIcon, mapper.getIcon(sunnyCodeA))
        assertEquals(sunnyIcon, mapper.getIcon(sunnyCodeB))
        assertEquals(moonIcon, mapper.getIcon(moonCode))
        assertEquals(cloudyIcon, mapper.getIcon(cloudyCode))
        assertEquals(nightCloudyIcon, mapper.getIcon(nightCloudyCode))
    }
    //endregion

    //region Small Icon Tests
    @Test
    fun invalidKeyProducesDefaultSmallIcon() {
        assertEquals(defaultIcon, mapper.getIcon(invalidKey))
    }

    @Test
    fun getSmallIconProducesValidIcons() {
        assertEquals(smallStormyIcon, mapper.getSmallIcon(stormyCode))
        assertEquals(smallRainyIcon, mapper.getSmallIcon(rainyCode))
        assertEquals(smallRainy2Icon, mapper.getSmallIcon(rainy2CodeA))
        assertEquals(smallRainy2Icon, mapper.getSmallIcon(rainy2CodeB))
        assertEquals(smallSunnyIcon, mapper.getSmallIcon(sunnyCodeA))
        assertEquals(smallSunnyIcon, mapper.getSmallIcon(sunnyCodeB))
        assertEquals(smallMoonIcon, mapper.getSmallIcon(moonCode))
        assertEquals(smallCloudyIcon, mapper.getSmallIcon(cloudyCode))
        assertEquals(smallNightCloudyIcon, mapper.getSmallIcon(nightCloudyCode))
    }

    //endregion

}