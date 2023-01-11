package com.inwis

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SumutActivity : AppCompatActivity() {
    private var list: ArrayList<Sumut> = arrayListOf()


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sumut)

        val rv_sumut = findViewById<RecyclerView>(R.id.rv_sumut)
        rv_sumut.setHasFixedSize(true)
        list.addAll(DataSumut.listData)

        rv_sumut.layoutManager = LinearLayoutManager(this)
        val listSumutAdapter = ListSumutAdapter(list)
        rv_sumut.adapter = listSumutAdapter


    }
}