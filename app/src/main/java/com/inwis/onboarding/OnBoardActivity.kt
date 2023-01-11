package com.inwis.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import com.inwis.LoginActivity
import com.inwis.MainActivity
import com.inwis.R
import com.inwis.databinding.ActivityOnBoardBinding

class OnBoardActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOnBoardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewpager.adapter = ViewPagerAdapter()
        TabLayoutMediator(binding.tabLayout, binding.viewpager) {_, _ ->}.attach()

        binding.viewpager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                binding.btnNext.text = if (position == MAX_STEP - 1) getString(R.string.mulai) else getString(
                    R.string.selanjutnya)
            }
        })

        binding.tvSkip.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }

        binding.btnNext.setOnClickListener {
            if (binding.btnNext.text.toString() == getString(R.string.mulai)) {
                startActivity(Intent(this, LoginActivity::class.java))
            }else{
                val currentPosition = (binding.viewpager.currentItem) + 1
                binding.viewpager.currentItem = currentPosition
                binding.btnNext.text = if (currentPosition >= MAX_STEP - 1 ) getText(
                    R.string.mulai) else getText(R.string.selanjutnya)
            }
        }
    }

    companion object{
        const val MAX_STEP = 4
    }
}