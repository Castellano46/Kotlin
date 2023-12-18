package com.keepcoding.ejerciciolisteners

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import androidx.core.widget.doAfterTextChanged
import com.keepcoding.ejerciciolisteners.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.et1.doAfterTextChanged {
            binding.bJuntar.isEnabled =  binding.et1.text.toString().isNotEmpty() && binding.et2.text.isNotEmpty()
        }

        binding.et2.doAfterTextChanged {
            binding.bJuntar.isEnabled =  binding.et1.text.toString().isNotEmpty() && binding.et2.text.isNotEmpty()
        }

        binding.bJuntar.setOnClickListener {
            binding.et1.setText(binding.et1.text.toString() + binding.et2.text.toString())
            binding.et2.setText("")
        }
    }
}