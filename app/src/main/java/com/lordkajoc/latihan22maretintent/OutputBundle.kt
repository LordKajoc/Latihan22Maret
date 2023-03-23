package com.lordkajoc.latihan22maretintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lordkajoc.latihan22maretintent.databinding.ActivityOutputBundleBinding

class OutputBundle : AppCompatActivity() {
    //aktivasi viewbinding antara class dengan layout
    lateinit var binding: ActivityOutputBundleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOutputBundleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //get data yang dikirim oleh bundle class HomeBundle
        val getBundle = intent.extras
        //mendapatkan data dari bundle munggunakan kata kunci yang sesuai
        val outputname = getBundle?.getString("namebun")
        binding.textViewHalobun.text = "Halo, $outputname"
        val outputtahun = getBundle?.getString("tahunbun")?.toInt()
        val hasil = 2023 - outputtahun!!
        binding.textViewUmurbun.text = "Umur kamu $hasil tahun"
    }
}