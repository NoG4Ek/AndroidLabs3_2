package com.poly.androidlabs3_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.poly.androidlabs3_2.databinding.Activity2Binding

class Activity2 : AppCompatActivity() {
    companion object {
        private const val ONLY_REQUEST = 0;
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bnToThird.setOnClickListener {
            goToThird()
        }

        binding.bnToFirst.setOnClickListener {
            finish()
        }

        binding.bnToAbout.setOnClickListener {
            goToAbout()
        }
    }

    private fun goToThird() {
        val intent = Intent(this, Activity3::class.java)
        startActivityForResult(intent, ONLY_REQUEST)
    }

    private fun goToAbout() {
        val intent = Intent(this, ActivityAbout::class.java)
        startActivity(intent)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (resultCode == 1) {
            finish()
        }
    }
}