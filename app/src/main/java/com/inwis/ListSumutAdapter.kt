package com.inwis

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ListSumutAdapter(private val listSumut: ArrayList<Sumut>) :
    RecyclerView.Adapter<ListSumutAdapter.ListViewHolder>() {
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvWisata: TextView = itemView.findViewById(R.id.tv_judul)
        var tvDesc: TextView = itemView.findViewById(R.id.tv_desc)
        var imgSumut: ImageView = itemView.findViewById(R.id.iv_wisata)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_sumut, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val sumut = listSumut[position]

        Glide.with(holder.itemView.context)
            .load(sumut.img)
            .into(holder.imgSumut)
        holder.tvWisata.text = sumut.sumut
        holder.tvDesc.text= sumut.sumut

    }

    override fun getItemCount(): Int {
        return listSumut.size
    }
}

