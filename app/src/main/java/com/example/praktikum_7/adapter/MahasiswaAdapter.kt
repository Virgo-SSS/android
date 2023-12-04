package com.example.praktikum_7.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.praktikum_7.DetailMahasiswa
import com.example.praktikum_7.R
import com.example.praktikum_7.model.MahasiswaModel

class MahasiswaAdapter(val context: Context): RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder>()
{
    private val listMahasiswa : MutableList<MahasiswaModel> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MahasiswaViewHolder {
       return MahasiswaViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_mahasiswa, parent, false))
    }

    override fun getItemCount(): Int {
        return listMahasiswa.size
    }

    override fun onBindViewHolder(holder: MahasiswaViewHolder, position: Int) {
        holder.bindModel(listMahasiswa[position])
    }

    inner class MahasiswaViewHolder(view: View): RecyclerView.ViewHolder(view) {
        private val imgFoto: ImageView = view.findViewById(R.id.img_mahasiswa)
        private val tvName: TextView = view.findViewById(R.id.tv_name)
        private val tvNim: TextView = view.findViewById(R.id.tv_nim)

        private val cardViewMahasiswa: CardView = view.findViewById(R.id.cvMahasiswa)

        fun bindModel(mahasiswa: MahasiswaModel) {
            imgFoto.setImageResource(mahasiswa.getFoto())
            tvName.text = mahasiswa.getName()
            tvNim.text = mahasiswa.getNim()

            cardViewMahasiswa.setOnClickListener{
                val i: Intent = Intent(context, DetailMahasiswa::class.java).apply {
                    putExtra("foto", mahasiswa.getFoto())
                    putExtra("name", mahasiswa.getName())
                    putExtra("nim", mahasiswa.getNim())
                    putExtra("alamat", mahasiswa.getAlamat())
                    putExtra("prodi", mahasiswa.getProdi())
                }

                context.startActivity(i)
            }
        }
    }

    fun setListDataMahasiswa(listData: MutableList<MahasiswaModel>) {
        listMahasiswa.clear()
        listMahasiswa.addAll(listData)
        notifyDataSetChanged()
    }
}