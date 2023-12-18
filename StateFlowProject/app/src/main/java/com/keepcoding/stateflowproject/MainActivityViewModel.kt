package com.keepcoding.stateflowproject

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class MainActivityViewModel: ViewModel() {

    private val _uiState = MutableStateFlow(0)
    val uiState: StateFlow<Int> = _uiState

    private val _uiState2 = MutableStateFlow<State>(Success(0))
    val uiState2: StateFlow<State> = _uiState2


    sealed class State

    class Loading: State()

    class Success(var num: Int): State()

    /* fun sumarUno() {
        _uiState.value = _uiState.value + 1
    }*/

    fun sumarUno() {
        viewModelScope.launch(Dispatchers.IO) {
            delay(1000)
            (uiState2.value as? Success)?.let {
                _uiState2.value = Success(it.num + 1)
            }
        }
    }

}