package com.lordkajoc.latihan22maretintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lordkajoc.latihan22maretintent.databinding.ActivityHomeParcelableBinding

class HomeParcelable : AppCompatActivity() {
    //aktivasi viewbinding antara class dengan layout
    lateinit var binding: ActivityHomeParcelableBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeParcelableBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // View pada layout telah dapat diakses id nya

        //Aksi Button Save
        binding.btnSavepar.setOnClickListener {
            //pindah activity dari class ini ke class OuputSerializable
            val pindah = Intent(this, OutputParcelable::class.java)
            // Get Text hasil input user
            val inputname = binding.etNamepar.text.toString()
            val inputemail = binding.etEmailpar.text.toString()
            val inputphone = binding.etPhonepar.text.toString()
            val inputaddress = binding.etAddresspar.text.toString()
            val inputage = binding.etAgepar.text.toString()

            //Menggunakan Metode Parcelable untuk Membawa Data
            val myDataPar = MyDataClassParcelable(
                inputname,
                inputemail,
                inputphone,
                inputaddress,
                inputage,
            )
            pindah.putExtra("packpar", myDataPar)
            startActivity(pindah)
        }
    }
}