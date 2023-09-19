package com.example.homework.ui.one

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.homework.R
import com.example.homework.common.viewBinding
import com.example.homework.databinding.FragmentOneBinding

class OneFragment : Fragment(R.layout.fragment_one) {

    private val binding by viewBinding(FragmentOneBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {

            btn.setOnClickListener {
                val name = etName.text.toString()
                val surname = etSurname.text.toString()
                val action = OneFragmentDirections.oneToTwo(name, surname)
                findNavController().navigate(action)
            }
        }
    }
}
