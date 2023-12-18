package com.keepcoding.stateflowproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import com.keepcoding.stateflowproject.databinding.ActivityMainBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    val viewModel : MainActivityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setListener()
        setObservers()
    }

    fun setListener() {
        binding.bSumarUno.setOnClickListener { viewModel.sumarUno() }
    }

    fun setObservers(){
        lifecycleScope.launch(Dispatchers.Main) {
            /* viewModel.uiState.collect {
                binding.tvContador.text = it.toString()
            } */
            viewModel.uiState2.collect {
                Log.w("Carlos", "here")
                when(it) {
                    is MainActivityViewModel.Loading -> {
                        binding.pbLoading.visibility = View.VISIBLE
                        binding.bSumarUno.isEnabled = false
                    }
                    is MainActivityViewModel.Success -> {
                        binding.pbLoading.visibility = View.INVISIBLE
                        binding.bSumarUno.isEnabled = true
                        binding.tvContador.text = it.num.toString()
                    }
                }
            }
        }
    }
}