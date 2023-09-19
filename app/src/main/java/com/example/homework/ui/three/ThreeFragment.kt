package com.example.homework.ui.three

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.homework.R
import com.example.homework.common.viewBinding
import com.example.homework.data.model.InfoModel
import com.example.homework.databinding.FragmentThreeBinding

class ThreeFragment : Fragment(R.layout.fragment_three) {

    private val binding by viewBinding(FragmentThreeBinding::bind)

    private val args by navArgs<ThreeFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {
            tvName.text = args.user.name.plus(" ${args.user.surname}")

            btnNext.setOnClickListener {
                val age = etAge.text.toString()
                val size = etSize.text.toString()
                val kilo = etKilo.text.toString()
                val hobby = etHobby.text.toString()
                val info = InfoModel(args.user, age.toInt(), size.toFloat(), kilo.toInt(), hobby)
                val action = ThreeFragmentDirections.threeToFour(info)
                findNavController().navigate(action)
            }
        }
    }
}

