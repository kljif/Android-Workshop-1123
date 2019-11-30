package com.example.workshop1126.newsapp

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("/v2/top-headlines")
    fun getNews(@Query("apiKey") apiKey: String, @Query("country") country: String): Call<ResponseData>
}