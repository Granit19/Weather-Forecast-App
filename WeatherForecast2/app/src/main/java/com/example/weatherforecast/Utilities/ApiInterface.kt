package com.example.weatherforecast.Utilities

import com.example.weatherforecast.Models.WeatherModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET("weather")
    fun getCurrentWeatherData(
        @Query("lat") lat:String,
        @Query("lon") lon:String,
        @Query("AppID") appid:String
    ):Call<WeatherModel>

    @GET("weather")
    fun getCityWeatherData(
        @Query("q") q:String,
        @Query("APPID") lon:String,
    ):Call<WeatherModel>

    @GET("/forecast/daily")
    fun getFutureWeatherData(
        @Query("lat") lat:String,
        @Query("lon") lon:String,
        @Query("cnt") cnt:String,
        @Query("appid") appid: String,
    )
}