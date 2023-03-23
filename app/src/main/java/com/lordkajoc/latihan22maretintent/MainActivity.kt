package com.lordkajoc.latihan22maretintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lordkajoc.latihan22maretintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonBundle.setOnClickListener {
            startActivity(Intent(this, HomeBundle::class.java))
        }
        binding.buttonSerializable.setOnClickListener {
            startActivity(Intent(this, HomeSerializable::class.java))
        }
        binding.buttonParcelable.setOnClickListener {
            startActivity(Intent(this, HomeParcelable::class.java))
        }
    }
}