package com.example.sunshine.network
import com.example.sunshine.data.Weather.WeatherResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {
    @GET("/data/2.5/forecast/daily?q=Atlanta&mode=json&cnt=10&units=imperial&apikey=3aa158b2f14a9f493a8c725f8133d704")
    suspend fun getForecast(): Response<WeatherResponse>
}