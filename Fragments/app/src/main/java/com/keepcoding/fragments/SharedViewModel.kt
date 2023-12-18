package com.keepcoding.fragments

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class SharedViewModel: ViewModel() {

    private val _num = MutableStateFlow(0)
    val num : StateFlow<Int> = _num

    fun sumarUno() {
        _num.value = num.value + 1
    }

}