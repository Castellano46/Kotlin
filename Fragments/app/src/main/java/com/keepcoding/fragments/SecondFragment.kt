package com.keepcoding.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import com.keepcoding.fragments.databinding.FragmentFirstBinding
import com.keepcoding.fragments.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var binding : FragmentSecondBinding
    private val viewModel: ViewModelSecondFragment by viewModels()
    private val viewShareModel: SharedViewModel by activityViewModels()

    var texto: String = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(inflater)
        return binding.root
    }

    /* fun ponerTexto(texto: String) {
        // Esto falla xq se ejecuta antes de que el binding esté creado
        binding.tvTexto.text = texto
    }*/

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.root.setOnClickListener { viewShareModel.sumarUno() }

        // TODO hacer lo que queramos con las vistas
    }

}