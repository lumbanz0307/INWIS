package com.inwis

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class KampungWisataActivity : AppCompatActivity() {
    private var list: ArrayList<KampungWisata> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kampung_wisata)
        val rv_kampung_wisata = findViewById<RecyclerView>(R.id.rv_kampung_wisata)
        rv_kampung_wisata.setHasFixedSize(true)
        list.addAll(DataKampungWisata.listData)

        rv_kampung_wisata.layoutManager = LinearLayoutManager(this)
        val listKampungWisataAdapter = ListKampungWisataAdapter(list)
        rv_kampung_wisata.adapter = listKampungWisataAdapter

    }

}

