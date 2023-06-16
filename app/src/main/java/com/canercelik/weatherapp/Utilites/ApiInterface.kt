package com.canercelik.weatherapp.Utilites

import android.telecom.Call
import com.canercelik.weatherapp.Models.WeatherModel
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiInterface {

    @GET("weather")
    fun getCurrentWeatherData(
        @Query("lat") lat:String,
        @Query("lon") lon:String,
        @Query("APPID") appid:String
        ):retrofit2.Call<WeatherModel>

    @GET("weather")
    fun getCityWeatherData(
        @Query("q") q:String,
        @Query("APPID") appid: String
        ):retrofit2.Call<WeatherModel>
}