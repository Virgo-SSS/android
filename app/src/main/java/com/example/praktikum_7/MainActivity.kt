package com.example.praktikum_7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.praktikum_7.adapter.MahasiswaAdapter
import com.example.praktikum_7.databinding.ActivityMainBinding
import com.example.praktikum_7.model.MahasiswaModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var mahasiswaAdapter: MahasiswaAdapter

    private val lm = LinearLayoutManager(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initView()
    }

    private fun initView() {
        binding.rvMahasiswa.layoutManager = lm
        mahasiswaAdapter = MahasiswaAdapter(this)
        binding.rvMahasiswa.adapter = mahasiswaAdapter

        val listDataMahasiswa: MutableList<MahasiswaModel> = ArrayList()

        val arrayMahasiswa: ArrayList<MahasiswaModel> = arrayListOf<MahasiswaModel>(
            MahasiswaModel(R.drawable.a, "Muhammad Rizky Ramdhani", "20190140004", "Jl. Raya Cikaret No. 1", "Sistem Informasi"),
            MahasiswaModel(R.drawable.b, "Asep Kurniawan", "2019014005", "Jl. Rajawali No. 1", "Sistem Informasi"),
            MahasiswaModel(R.drawable.c, "Totong Panjaitan", "2019014006", "Jl. Raya Cikaret No. 2", "Sistem Informasi"),
            MahasiswaModel(R.drawable.d, "Wareg Tan", "2019014007", "Jl. Raya Cikaret No. 3", "Sistem Informasi"),
            MahasiswaModel(R.drawable.e, "Liu Jhon", "2019014008", "Jl. Raya Cikaret No. 4", "Sistem Informasi"),
            MahasiswaModel(R.drawable.f, "Lorem Simanjuntak", "2019014009", "Jl. Raya Cikaret No. 5", "Sistem Informasi")
        )

        listDataMahasiswa.addAll(arrayMahasiswa)

        mahasiswaAdapter.setListDataMahasiswa(listDataMahasiswa)
    }
}