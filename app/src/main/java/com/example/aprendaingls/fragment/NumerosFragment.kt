package com.example.aprendaingls.fragment

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.aprendaingls.R
import com.example.aprendaingls.databinding.FragmentNumerosBinding
import com.example.aprendaingls.databinding.FragmentVogaisBinding

class NumerosFragment : Fragment(),View.OnClickListener {
    lateinit var binding: FragmentNumerosBinding
    lateinit var midiaPlayer : MediaPlayer

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = FragmentNumerosBinding.inflate(layoutInflater)

        binding.imageUm.setOnClickListener(this)
        binding.imageDois.setOnClickListener(this)
        binding.imageTres.setOnClickListener(this)
        binding.imageQuatro.setOnClickListener(this)
        binding.imageCinco.setOnClickListener(this)
        binding.imageSeix.setOnClickListener(this)

        return binding.root
}

    override fun onClick(p0: View?) {
        when(p0!!.id){
            binding.imageUm.id ->{midiaPlayer = MediaPlayer.create(activity,R.raw.one)
                tocar()}
            binding.imageDois.id ->{midiaPlayer = MediaPlayer.create(activity,R.raw.two)
                tocar()}
            binding.imageTres.id ->{midiaPlayer = MediaPlayer.create(activity,R.raw.three)
                tocar()}
            binding.imageQuatro.id ->{midiaPlayer = MediaPlayer.create(activity,R.raw.four)
                tocar()}
            binding.imageCinco.id ->{midiaPlayer = MediaPlayer.create(activity,R.raw.five)
                tocar()}
            binding.imageSeix.id ->{midiaPlayer = MediaPlayer.create(activity,R.raw.six)
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