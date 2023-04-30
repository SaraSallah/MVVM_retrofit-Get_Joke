package com.example.mvvm_joke

import com.example.mvvm_joke.model.JokeRseponse
import com.example.mvvm_joke.networking.API
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.Response

class JokeRepository {
    suspend fun getRandomJoke():Flow<JokeRseponse>{
        return  flow {
            emit(API.apiService.getRandomJoke().body()!!)
        }
    }
}