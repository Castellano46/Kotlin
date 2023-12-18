package com.keepcoding.viewmodelbasico

import androidx.lifecycle.ViewModel
import kotlin.random.Random

class MainActivityViewModel: ViewModel() {

    val numAleatorio = Random.nextInt()

    fun cambiarTextoAleatorio() = Random.nextInt()

}