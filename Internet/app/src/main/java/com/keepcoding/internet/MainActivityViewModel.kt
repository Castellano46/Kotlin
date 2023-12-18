package com.keepcoding.internet

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.gson.Gson
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import okhttp3.Credentials
import okhttp3.FormBody
import okhttp3.OkHttpClient
import okhttp3.Request

class MainActivityViewModel: ViewModel() {

    val BASE_URL = "https://dragonball.keepcoding.education/api/"

    private val _uiState = MutableStateFlow<State>(State.Idle())
    val uiState : StateFlow<State> = _uiState
    private var token = ""

    sealed class State {
        class Idle : State()
        class Error(val message: String) : State()
        class Loading : State()
        class SucessTestBasico(val bootcampList: String) : State()
        class SucessLogin : State()
        class SucessGetHeroes(val heroList: List<Hero>) : State()
    }


    fun launchTestBasico() {
        viewModelScope.launch(Dispatchers.IO) {
            _uiState.value = State.Loading()
            val client = OkHttpClient()
            val url = "${BASE_URL}data/bootcamps"
            val request = Request.Builder()
                .url(url)
                .build()
            val call = client.newCall(request)
            val response = call.execute()
            if (response.isSuccessful) {
                _uiState.value = response.body?.let {
                    State.SucessTestBasico(it.string())
                } ?: State.Error("Error: la respuesta estaba vacía")
            } else {
                _uiState.value = State.Error("Error: en la realización de la request")
            }
        }
    }

    fun lauchLogin() {
        viewModelScope.launch(Dispatchers.IO) {
            _uiState.value = State.Loading()
            val client = OkHttpClient()
            val url = "${BASE_URL}auth/login"
            val credentials = Credentials.basic("carlos.bellmont1@pruebmail.es", "123456")
            val formBody = FormBody.Builder() // Esto hace que la request sea de tipo POST
                .build()
            val request = Request.Builder()
                .url(url)
                .addHeader("Authorization", credentials)
                .post(formBody)
                .build()
            val call = client.newCall(request)
            val response = call.execute()
            _uiState.value =  if (response.isSuccessful)
                response.body?.let {
                    token = it.string()
                    State.SucessLogin()
                } ?: State.Error("Empty Token")
            else
                State.Error(response.message)
        }
    }
    
    fun lauchGetHeroes() {
        viewModelScope.launch(Dispatchers.IO) {
            _uiState.value = State.Loading()
            val client = OkHttpClient()
            val url = "${BASE_URL}heros/all"
            val formBody = FormBody.Builder() // Esto hace que la request sea de tipo POST
                .add("name", "")
                .build()
            val request = Request.Builder()
                .url(url)
                .addHeader("Authorization", "Bearer $token")
                .post(formBody)
                .build()
            val call = client.newCall(request)
            val response = call.execute()
            _uiState.value =  if (response.isSuccessful)
                response.body?.let {
                    val herosDtoArray : Array<HeroDto> = Gson().fromJson(it.string(), Array<HeroDto>::class.java)
                    val heroArray = herosDtoArray.map {
                        Hero("Mi nombre es ${it.name}")
                    }
                    State.SucessGetHeroes(heroArray.toList())
                } ?: State.Error("Empty Token")
            else
                State.Error(response.message)
        }
    }
}