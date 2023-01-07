package com.inwis

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide



class ListKampungWisataAdapter (private val listKampungWisata: ArrayList<KampungWisata>) : RecyclerView.Adapter<ListKampungWisataAdapter.ListViewHolder>() {
    inner class ListViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvWisata : TextView = itemView.findViewById(R.id.tv_judul)
        var imgWisata : ImageView = itemView.findViewById(R.id.iv_wisata)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_kampung_wisata, parent,false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val wisata = listKampungWisata[position]

        Glide.with(holder.itemView.context)
            .load(wisata.img)
            .into(holder.imgWisata)
        holder.tvWisata.text= wisata.kampung_wisata

    }

    override fun getItemCount(): Int {
        return listKampungWisata.size
    }
}

