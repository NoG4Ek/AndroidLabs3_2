package com.poly.androidlabs3_2

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.poly.androidlabs3_2.databinding.Activity3Binding

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = Activity3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toSecond.setOnClickListener {
            setResult(2)
            finish()
        }

        binding.toFirst.setOnClickListener {
            setResult(1)
            finish()
        }

        binding.toAbout.setOnClickListener {
            goToAbout()
        }
    }

    private fun goToAbout() {
        val intent = Intent(this, ActivityAbout::class.java)
        startActivity(intent)
    }
}