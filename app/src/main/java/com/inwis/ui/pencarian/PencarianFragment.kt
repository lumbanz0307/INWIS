package com.inwis.ui.pencarian

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.inwis.databinding.FragmentPencarianBinding

class PencarianFragment : Fragment() {

private var _binding: FragmentPencarianBinding? = null

  private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        ViewModelProvider(this)[PencarianViewModel::class.java]

        _binding = FragmentPencarianBinding.inflate(inflater, container, false)

        return binding.root
    }

override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}