package com.keepcoding.listas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.keepcoding.listas.databinding.ActivityMainBinding

interface Ordenable {
    fun ordenar(hero: Hero)
}

class MainActivity : AppCompatActivity(), Ordenable {

    private lateinit var binding : ActivityMainBinding
    private val viewModel : MainActivityViewModel by viewModels()
    private val heroAdapter = HeroAdapter(this)

    val list = listOf(
        Hero("Goku"),
        Hero("Vegeta"),
        Hero("Krilin"),
        Hero("Satan"),
        Hero("C19"),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setLinteners()
        configurarReciclerView()
    }

    fun setLinteners() {
        binding.tvTitle.setOnClickListener { rellenarLista() }
    }

    fun configurarReciclerView() {
        binding.rvHeros.layoutManager = LinearLayoutManager(this)
        // binding.rvHeros.layoutManager = GridLayoutManager(this,2)
        binding.rvHeros.adapter = heroAdapter
    }

    fun rellenarLista(){
        heroAdapter.actualizarListaHeros(list.shuffled())
    }

    override fun ordenar(hero: Hero) {
        val list = viewModel.ponerPrimero(hero, list)
        heroAdapter.actualizarListaHeros(list)
    }

}