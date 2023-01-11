package com.inwis.ui.akun

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.inwis.databinding.FragmentAkunBinding

class AkunFragment : Fragment() {
    private var _binding : FragmentAkunBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       _binding = FragmentAkunBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    companion object
}