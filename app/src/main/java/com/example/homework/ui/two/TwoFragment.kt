package com.example.homework.ui.two

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.homework.R
import com.example.homework.common.viewBinding
import com.example.homework.data.model.UserModel
import com.example.homework.databinding.FragmentTwoBinding

class TwoFragment : Fragment(R.layout.fragment_two) {

    private val binding by viewBinding(FragmentTwoBinding::bind)


    private val args by navArgs<TwoFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {
            tvName.text = args.name.plus(" ${args.surname}")

            btnNext.setOnClickListener {
                val mail = etEmail.text.toString()
                val phone = etPhone.text.toString()
                val user = UserModel(args.name, args.surname, mail, phone.toInt())
                val action = TwoFragmentDirections.twoToThree(user)
                findNavController().navigate(action)
            }
        }
    }
}