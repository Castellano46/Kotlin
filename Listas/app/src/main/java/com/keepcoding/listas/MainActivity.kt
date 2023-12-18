package com.keepcoding.listas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.keepcoding.listas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private val heroAdapter = HeroAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        configurarReciclerView()
    }

    fun configurarReciclerView() {
        binding.rvHeros.layoutManager = LinearLayoutManager(this)
        // binding.rvHeros.layoutManager = GridLayoutManager(this,2)
        binding.rvHeros.adapter = heroAdapter
    }
}