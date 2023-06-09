package com.example.mvvm_joke.networking

import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory


object API {
    private const val BASE_URL = "https://v2.jokeapi.dev/"

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val apiService: JokeApiService = retrofit.create(JokeApiService::class.java)
}