package com.example.mvvm_joke.networking

import com.example.mvvm_joke.model.JokeRseponse
import io.reactivex.rxjava3.core.Single
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET


interface JokeApiService {
    @GET("joke/Any")
   suspend fun getRandomJoke(): Response<JokeRseponse>

}
