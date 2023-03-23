package com.lordkajoc.latihan22maretintent

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import com.lordkajoc.latihan22maretintent.databinding.ActivityOutputParcelableBinding

class OutputParcelable : AppCompatActivity() {
    //Aktivasi ViewBinding antara class dengan layout
    lateinit var binding: ActivityOutputParcelableBinding

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOutputParcelableBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //View pada Layout sudah dapat diakses

        //get data dari kiriman class HomeSerializable
        val getpackparcelable = intent.getParcelableExtra("packpar") as MyDataClassParcelable?
        binding.tvNamepar.text = getpackparcelable!!.name
        binding.tvEmailpar.text = getpackparcelable.email
        binding.tvPhonepar.text = getpackparcelable.phone
        binding.tvAddresspar.text = getpackparcelable.address
        binding.tvAgepar.text = getpackparcelable.age + " Years old"
    }
}