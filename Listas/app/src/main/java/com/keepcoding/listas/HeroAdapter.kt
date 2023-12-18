package com.keepcoding.listas

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.keepcoding.listas.databinding.ItemHeroBinding

class HeroAdapter: RecyclerView.Adapter<HeroAdapter.HeroViewHolder>() {

    class HeroViewHolder(private val binding: ItemHeroBinding): RecyclerView.ViewHolder(binding.root) {

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
            ItemHeroBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: HeroViewHolder, position: Int) {
        holder.mostrarPosicion(position)
    }

    override fun getItemCount(): Int {
        return 100
    }

}