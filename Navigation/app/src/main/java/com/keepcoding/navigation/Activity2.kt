package com.keepcoding.navigation

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import com.keepcoding.navigation.databinding.Activity2Binding

class Activity2: AppCompatActivity() {

    companion object {
        val INFO_PERSONAJE = "asdfasdf"
        val INFO_ACTIVITY = "INFO_ACTIVITY_2"
        fun lanzarActivity(context: Context, texto: String, personaje: Personaje) {
            val intent = Intent(context, Activity2::class.java)
            intent.putExtra(INFO_ACTIVITY, texto)
            intent.putExtra(INFO_PERSONAJE, Gson().toJson(personaje))
            context.startActivity(intent)

        }
    }

    private lateinit var binding : Activity2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val texto = intent.getStringExtra(INFO_ACTIVITY) ?: ""
        binding.tvHello.text = texto

        val personajeEnString = intent.getStringExtra(INFO_ACTIVITY) ?: ""
        val personaje = Gson().fromJson(personajeEnString, Personaje::class.java)
        binding.tvHello.text = binding.tvHello.text.toString() + personaje.toString()
    }

}