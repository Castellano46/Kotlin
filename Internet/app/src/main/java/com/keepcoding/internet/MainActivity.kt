package com.keepcoding.internet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import com.keepcoding.internet.databinding.ActivityMainBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainActivityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setListeners()
        setObservers()
    }

    private fun setListeners() {
        with(binding) {
            bTestBasico.setOnClickListener { viewModel.launchTestBasico() }
            bLogin.setOnClickListener { viewModel.lauchLogin() }
            bGetHeroes.setOnClickListener { viewModel.lauchGetHeroes() }
        }
    }

    private fun showError(message: String) {
        showLoading(false)
        binding.tvResult.text = message
    }

    private fun showLoading(show: Boolean) {
        binding.layoutLoading.pbLoading.visibility = if (show)
            View.VISIBLE
        else
            View.GONE
    }

    private fun showSuccessTestBasico(bootcampList: String) {
        showLoading(false)
        binding.tvResult.text = bootcampList
    }

    private fun showSuccessLogin() {
        showLoading(false)
        Toast.makeText(this, "Login exitoso", Toast.LENGTH_LONG).show()
    }

    private fun showSuccessGetHeroes(heroList: List<Hero>) {
        showLoading(false)
        Toast.makeText(this, "Se han obtenido los heroes", Toast.LENGTH_LONG).show()
        var heros = ""
        heroList.forEach {
            heros += it.name + "\n"
        }
        binding.tvResult.text = heros
    }

    private fun setObservers() {
        lifecycleScope.launch(Dispatchers.Main) {
            viewModel.uiState.collect { state ->
                when (state) {
                    is MainActivityViewModel.State.Idle -> idle()
                    is MainActivityViewModel.State.Error -> showError(state.message)
                    is MainActivityViewModel.State.Loading -> showLoading(true)
                    is MainActivityViewModel.State.SucessTestBasico -> showSuccessTestBasico(state.bootcampList)
                    is MainActivityViewModel.State.SucessLogin -> showSuccessLogin()
                    is MainActivityViewModel.State.SucessGetHeroes -> showSuccessGetHeroes(state.heroList)
                }
            }
        }
    }

    private fun idle() {
        showLoading(false)
    }


}