package com.inwis.onboarding

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.inwis.R
import com.inwis.databinding.ItemonboardBinding

class ViewPagerAdapter: RecyclerView.Adapter<ViewPagerAdapter.ViewHolder>() {
    class ViewHolder(val binding: ItemonboardBinding): RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemonboardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder){
            when(position){
                0 ->{
                    binding.descrptiom.setText(R.string.onboard_1)
                    binding.ivWisata.setImageResource(R.drawable.tampilan1)
                }
                1-> {
                    binding.descrptiom.setText(R.string.onboard_2)
                    binding.ivWisata.setImageResource(R.drawable.tampilan2)
                }
                2 -> {
                    binding.descrptiom.setText(R.string.onboard_3)
                    binding.ivWisata.setImageResource(R.drawable.tampilan3)
                }
                3-> {
                    binding.descrptiom.setText(R.string.onboard_4)
                    binding.ivWisata.setImageResource(R.drawable.tampilan4)
                }
            }
        }
    }

    override fun getItemCount(): Int = OnBoardActivity.MAX_STEP
}