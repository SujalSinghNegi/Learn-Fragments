package com.example.learnfragments.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.learnfragments.R
import com.example.learnfragments.databinding.FragmentBlank2Binding

class BlankFragment2 : Fragment() {
    private lateinit var binding: FragmentBlank2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentBlank2Binding.inflate(inflater,container, false)
        binding.button.setOnClickListener {
            Toast.makeText(context, "Hello jiiiiiiiiiiii", Toast.LENGTH_SHORT).show()
        }

        return binding.root
    }

    companion object {

    }
}