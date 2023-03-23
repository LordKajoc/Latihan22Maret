package com.lordkajoc.latihan22maretintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lordkajoc.latihan22maretintent.databinding.ActivityOutputSerializableBinding

class OutputSerializable : AppCompatActivity() {
    //Aktivasi ViewBinding antara class dengan layout
    lateinit var binding: ActivityOutputSerializableBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOutputSerializableBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //View pada Layout sudah dapat diakses

        //get data dari kiriman class HomeSerializable
        val getpackserializable = intent.getSerializableExtra("packser") as MyDataClassSerializable
        binding.tvNameser.text = getpackserializable.name
        binding.tvEmailser.text = getpackserializable.email
        binding.tvPhoneser.text = getpackserializable.phone
        binding.tvAddressser.text = getpackserializable.address
        binding.tvAgeser.text = getpackserializable.age + " Years old"
    }
}