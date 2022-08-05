package com.example.aprendaingls.fragment

import android.media.MediaPlayer
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.aprendaingls.R
import com.example.aprendaingls.databinding.FragmentAnimaisBinding
import com.example.aprendaingls.databinding.FragmentNumerosBinding

public class AnimaisFragment : Fragment(), View.OnClickListener {
    lateinit var binding: FragmentAnimaisBinding
    lateinit var midiaPlayer : MediaPlayer

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = FragmentAnimaisBinding.inflate(layoutInflater)

        binding.imageCao.setOnClickListener(this)
        binding.imageGato.setOnClickListener(this)
        binding.imageLeao.setOnClickListener(this)
        binding.imageMacaco.setOnClickListener(this)
        binding.imageOverlha.setOnClickListener(this)
        binding.imageVaca.setOnClickListener(this)




        return binding.root
    }

    override fun onClick(p0: View?) {
        when(p0!!.id){
            binding.imageCao.id ->{midiaPlayer = MediaPlayer.create(activity,R.raw.dog)
                tocar()}
            binding.imageGato.id ->{midiaPlayer = MediaPlayer.create(activity,R.raw.cat)
                tocar()}
            binding.imageLeao.id ->{midiaPlayer = MediaPlayer.create(activity,R.raw.lion)
                tocar()}
            binding.imageMacaco.id ->{midiaPlayer = MediaPlayer.create(activity,R.raw.monkey)
                tocar()}
            binding.imageOverlha.id ->{midiaPlayer = MediaPlayer.create(activity,R.raw.sheep)
                tocar()}
            binding.imageVaca.id ->{midiaPlayer = MediaPlayer.create(activity,R.raw.cow)
                tocar()}
        }

    }
    fun tocar(){
        if(midiaPlayer != null){
            midiaPlayer.start()
            midiaPlayer.setOnCompletionListener { MediaPlayer.OnCompletionListener {midiaPlayer.release()}}
        }
    }



}