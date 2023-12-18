package com.keepcoding.viewmodelbasico

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.viewModels
import androidx.core.widget.doAfterTextChanged
import com.keepcoding.viewmodelbasico.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    val viewModel: MainActivityViewModel by viewModels()
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvHelloWorld.text = "El número aleatorio es ${viewModel.numAleatorio}"
        binding.tvHelloWorld.setOnClickListener {
            binding.tvHelloWorld.text = "El nuevo número es ${viewModel.cambiarTextoAleatorio()}"
        }


        Log.w("Carlos", "${viewModel.numAleatorio}")
        binding.bShowToast.setOnLongClickListener {
            Toast.makeText(this, "${getString(R.string.toast_text)} ${viewModel.numAleatorio}", Toast.LENGTH_LONG).show()
            false
        }

        binding.etTexto.doAfterTextChanged {
            it?.let { editableSeguro ->
                binding.tvNumChars.text = editableSeguro.toString().length.toString()
            }
        }
    }
}