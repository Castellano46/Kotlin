package com.keepcoding.stateflowproject

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    val viewModel = MainActivityViewModel()
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun testStateFlow() {
        viewModel.sumarUno()
        assertEquals(1, viewModel.uiState.value)
        viewModel.sumarUno()
        assertEquals(2, viewModel.uiState.value)
    }
}