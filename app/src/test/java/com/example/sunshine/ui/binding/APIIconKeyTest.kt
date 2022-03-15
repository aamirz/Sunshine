package com.example.sunshine.ui.binding

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class APIIconKeyTest {

    private lateinit var validCodes: Set<String>
    private lateinit var invalidIconCodeDouble: String
    private lateinit var invalidIconCodeSingle: String
    private lateinit var invalidIconCodeEmpty: String

    @Before
    fun setupTest() {
        invalidIconCodeEmpty = ""
        invalidIconCodeSingle  = "a"
        invalidIconCodeDouble = "aa"
        validCodes = setOf(
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
    }

    @Test
    fun keyNullForInvalidCode() {
        val invalidEmptyKey = OpenWeatherAPIIconKey(invalidIconCodeEmpty)
        assertNull(invalidEmptyKey.keyValue)

        val invalidIconKeySingle = OpenWeatherAPIIconKey(invalidIconCodeSingle)
        assertNull(invalidIconKeySingle.keyValue)

        val invalidIconKeyDouble = OpenWeatherAPIIconKey(invalidIconCodeDouble)
        assertNull(invalidIconKeyDouble.keyValue)
    }

    @Test
    fun keyNotNullForValidCodes() {
       for (code in validCodes) {
           val validKey = OpenWeatherAPIIconKey(code)
           assertNotNull(validKey.keyValue)
       }
    }


}