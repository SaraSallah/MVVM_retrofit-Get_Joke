package com.example.mvvm_joke.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvm_joke.JokeRepository
import com.example.mvvm_joke.model.JokeRseponse
import kotlinx.coroutines.launch


class MainViewModel : ViewModel() {
    val repository = JokeRepository()
    val joke = MutableLiveData<JokeRseponse>()

    init {
        getRandomJoke()
    }

     fun getRandomJoke() {
        viewModelScope.launch {
             repository.getRandomJoke().collect{
                 joke.postValue(it)
             }
        }
    }
}
