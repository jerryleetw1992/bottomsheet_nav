package com.test.bottomsheet_nav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.test.bottomsheet_nav.databinding.ActivityMainBinding
import com.test.bottomsheet_nav.databinding.NavMainBinding

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val navMain = NavMainBinding.inflate(layoutInflater)
        val bottomSheetDialog = BottomSheetDialog(this)
        bottomSheetDialog.setContentView(navMain.root)

        binding.showSheetBtn.setOnClickListener {
            Log.e(TAG,"The user tap 'show sheet btn'!!")

            bottomSheetDialog.show()
        }
    }
}