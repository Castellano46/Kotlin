package com.keepcoding.listas

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.keepcoding.listas.databinding.ItemHeroBinding

class HeroAdapter(val callback: Ordenable): RecyclerView.Adapter<HeroAdapter.HeroViewHolder>() {

    private var heroList: List<Hero> = emptyList()

    class HeroViewHolder(private val binding: ItemHeroBinding, val callback: Ordenable): RecyclerView.ViewHolder(binding.root) {

        fun mostrarHero(hero: Hero) {
            binding.tvNombre.text = hero.nombre
            binding.root.setOnClickListener {
                Toast.makeText(binding.root.context, "Has pulsado sobre ${hero.nombre}", Toast.LENGTH_LONG).show()
                callback.ordenar(hero)
            }
        }

        fun mostrarPosicion(position: Int) {
            if (position % 2 == 0) { // Es par
                val color = ContextCompat.getColor(binding.root.context, R.color.yellow)
                binding.root.setBackgroundColor(color)
            } else {
                val color = ContextCompat.getColor(binding.root.context, R.color.purple)
                binding.root.setBackgroundColor(color)
            }

            binding.tvPosicion.text = position.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroViewHolder {
        return HeroViewHolder(
            binding = ItemHeroBinding.inflate(LayoutInflater.from(parent.context), parent, false),
            callback= callback
        )
    }

    override fun onBindViewHolder(holder: HeroViewHolder, position: Int) {
        holder.mostrarHero(heroList[position])
        holder.mostrarPosicion(position)
    }

    override fun getItemCount(): Int {
        return heroList.count()
    }

    fun actualizarListaHeros(heroList: List<Hero>) {
        this.heroList = heroList
        notifyDataSetChanged()
    }

}