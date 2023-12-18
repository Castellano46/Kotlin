package com.keepcoding.viewmodelbasico

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class MainActivityViewModelTest {

    val viewModel = MainActivityViewModel()
    @Test
    fun `Comprobar Int esta en Rango`() {
        assertTrue(viewModel.numAleatorio > Int.MIN_VALUE)
        assertTrue(viewModel.numAleatorio < Int.MAX_VALUE)
    }

}