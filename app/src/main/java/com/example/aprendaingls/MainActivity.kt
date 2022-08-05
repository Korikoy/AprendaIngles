package com.example.aprendaingls

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.aprendaingls.databinding.ActivityMainBinding
import com.example.aprendaingls.fragment.AnimaisFragment
import com.example.aprendaingls.fragment.NumerosFragment
import com.example.aprendaingls.fragment.VogaisFragment
import com.ogaclejapan.smarttablayout.SmartTabLayout
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private lateinit var smartTabLayout: SmartTabLayout
    lateinit var viewPager: ViewPager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        smartTabLayout = binding.viewpagertab
        viewPager = binding.viewpager


        supportActionBar?.elevation = 0F


        // Configurar adapter para abas

        var adapter = FragmentPagerItemAdapter(supportFragmentManager
            , FragmentPagerItems.with(this)
                .add("Numeros",NumerosFragment::class.java)
                .add("Animais",AnimaisFragment::class.java)
                .add("Vogais",VogaisFragment::class.java)
                .create())

        viewPager.adapter = adapter
        smartTabLayout.setViewPager(viewPager)
    }
}