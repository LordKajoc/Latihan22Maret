package com.lordkajoc.latihan22maretintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lordkajoc.latihan22maretintent.databinding.ActivityHomeSerializableBinding

class HomeSerializable : AppCompatActivity() {
    //aktivasi viewbinding antara class dengan layout
    lateinit var binding: ActivityHomeSerializableBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeSerializableBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // View pada layout telah dapat diakses id nya

        //Aksi Button Save
        binding.btnSaveser.setOnClickListener {
            //pindah activity dari class ini ke class OuputSerializable
            val pindah = Intent(this, OutputSerializable::class.java)
            // Get Text hasil input user
            val inputname = binding.etNameser.text.toString()
            val inputemail = binding.etEmailser.text.toString()
            val inputphone = binding.etPhoneser.text.toString()
            val inputaddress = binding.etAddressser.text.toString()
            val inputage = binding.etAgeser.text.toString()

            //Menggunakan Metode Serializable untuk Membawa Data
            val myDataSerializable = MyDataClassSerializable(
                inputname,
                inputemail,
                inputphone,
                inputaddress,
                inputage,
            )
            pindah.putExtra("packser", myDataSerializable)
            startActivity(pindah)
        }
    }
}