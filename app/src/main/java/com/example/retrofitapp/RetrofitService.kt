package com.example.retrofitapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitService {
    private const val url="https://notificator.ir/api/v1/"
    private val retrofit = Retrofit.Builder()
        .baseUrl(url)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val apiService:ApiService = retrofit.create(ApiService::class.java)
}