package com.example.praktikum_7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.praktikum_7.databinding.ActivityDetailMahasiswaBinding

class DetailMahasiswa : AppCompatActivity()
{
    private lateinit var binding: ActivityDetailMahasiswaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailMahasiswaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initView()
    }

    private fun initView() {
        binding.imgDetailMahasiswa.setImageResource(intent.getIntExtra("foto", 0))
        binding.tvDetailName.text = intent.getStringExtra("name")
        binding.tvDetailNim.text = intent.getStringExtra("nim")
        binding.tvDetailAlamat.text = intent.getStringExtra("alamat")
        binding.tvDetailProdi.text = intent.getStringExtra("prodi")
    }
}