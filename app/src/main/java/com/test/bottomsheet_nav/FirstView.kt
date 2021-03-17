package com.test.bottomsheet_nav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.test.bottomsheet_nav.databinding.FirstViewBinding

class FirstView: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        val binding = FirstViewBinding.inflate(layoutInflater)
        val view = binding.root
        binding.nextBtn.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_firstView_to_secondView)
        }

        return view
    }
}