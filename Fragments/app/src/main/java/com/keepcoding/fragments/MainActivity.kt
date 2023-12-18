package com.keepcoding.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.viewModels
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import com.keepcoding.fragments.databinding.ActivityMainBinding
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

interface Sumable {
    fun sumarNum()
}
class MainActivity : AppCompatActivity(), Sumable {

    private lateinit var binding : ActivityMainBinding

    private val viewShareModel: SharedViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mostrarFragment1()
        mostrarFragment2()

        setObservers()
    }

    private fun setObservers() {
        lifecycleScope.launch {
            viewShareModel.num.collect {
                Log.w("Carlos", "Num = $it")
            }
        }
    }

    override fun sumarNum() {
        viewShareModel.sumarUno()
    }

    private fun mostrarFragment1() {
        supportFragmentManager
            .beginTransaction()
            // .add(binding.fFrament.id, FirstFragment())
            .replace(binding.fFrament.id, FirstFragment("Texto sobre fondo coral"))
            .addToBackStack(null) // Hace que el botón back tenga en cuenta al fragment
            .commit()
    }

    private fun mostrarFragment2() {
        supportFragmentManager
            .beginTransaction()
            // .add(binding.fFrament.id, SecondFragment())
            .replace(binding.fFrament.id, SecondFragment())
            .addToBackStack(null) // Hace que el botón back tenga en cuenta al fragment
            .commit()
    }

}