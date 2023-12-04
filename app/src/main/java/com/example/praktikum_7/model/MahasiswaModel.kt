package com.example.praktikum_7.model

class MahasiswaModel(
    private var foto: Int,
    private var name: String,
    private var nim: String,
    private var alamat: String,
    private var prodi: String
) {

    fun getFoto(): Int {
        return foto
    }

    fun setFoto(foto: Int) {
        this.foto = foto
    }

    fun getName(): String {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getNim(): String {
        return nim
    }

    fun setNim(nim: String) {
        this.nim = nim
    }

    fun getAlamat(): String {
        return alamat
    }

    fun setAlamat(alamat: String) {
        this.alamat = alamat
    }

    fun getProdi(): String {
        return prodi
    }

    fun setProdi(prodi: String) {
        this.prodi = prodi
    }

    
}