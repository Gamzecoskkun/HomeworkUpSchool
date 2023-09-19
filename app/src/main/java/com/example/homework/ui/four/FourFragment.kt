package com.example.homework.ui.four

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.homework.R
import com.example.homework.common.viewBinding
import com.example.homework.databinding.FragmentFourBinding

class FourFragment : Fragment(R.layout.fragment_four) {

    private val binding by viewBinding(FragmentFourBinding::bind)

    private val args by navArgs<FourFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {
            args.info.let {
                tvName.text = "${it.user.name} ${it.user.surname}"
                tvEmail.text = "Your e-mail: ${it.user.email}"
                tvPhone.text = "Your phone number: ${it.user.phone}"
                tvAge.text = "Your age: ${it.age}"
                tvSize.text = "Your heigth: ${it.size}"
                tvKilo.text = "Your weight: ${it.kilo}"
                tvHobby.text = "Your hobbies: ${it.hobby}"
            }
        }
    }
}