package com.example.aprendaingls.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.aprendaingls.databinding.FragmentVogaisBinding

class VogaisFragment : Fragment() {
    lateinit var binding: FragmentVogaisBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = FragmentVogaisBinding.inflate(layoutInflater)

        return binding.root
    }

}