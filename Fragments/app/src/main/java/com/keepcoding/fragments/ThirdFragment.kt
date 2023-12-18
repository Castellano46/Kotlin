package com.keepcoding.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.keepcoding.fragments.databinding.FragmentFirstBinding
import kotlin.random.Random

class ThirdFragment(val texto: String, val sumable: Sumable) : Fragment() {

    private lateinit var binding : FragmentFirstBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // TODO hacer lo que queramos con las vistas
        binding.tvText.text = texto
        binding.root.setOnClickListener { sumable.sumarNum() }
    }


}