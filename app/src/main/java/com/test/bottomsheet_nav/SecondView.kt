package com.test.bottomsheet_nav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.test.bottomsheet_nav.databinding.SecondViewBinding

class SecondView: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        val binding = SecondViewBinding.inflate(layoutInflater)
        val view = binding.root
        binding.backBtn.setOnClickListener {
            Navigation.findNavController(view).popBackStack()
        }
        return view
    }
}