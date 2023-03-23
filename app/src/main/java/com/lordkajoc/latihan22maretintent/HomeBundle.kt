package com.lordkajoc.latihan22maretintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lordkajoc.latihan22maretintent.databinding.ActivityHomeBundleBinding

class HomeBundle : AppCompatActivity() {
    //aktivasi viewbinding antara class dengan layout
    lateinit var binding: ActivityHomeBundleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBundleBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //View pada layout sudah dapat diakses id nya

        //Aksi Button Save
        binding.btnSavebun.setOnClickListener {
            //pindah activity dari class ini ke class OutputBundle
            var pindah = Intent(this, OutputBundle::class.java)
            //Menggunakan Metode Bundle
            var bundle = Bundle()
            //Menentuka data yang akan dibawa ke class OutputBundle
            var namebun = binding.etNamebun.text.toString()
            var tahunbun = binding.etTahunbun.text.toString()
            bundle.putString("namebun", namebun)
            bundle.putString("tahunbun", tahunbun)
            pindah.putExtras(bundle)
            startActivity(pindah)
        }
    }
}