package com.inwis.ui.halaman
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.inwis.KampungWisataActivity
import com.inwis.SumutActivity
import com.inwis.databinding.FragmentHalamanBinding

class HalamanFragment : Fragment() {

    private var _binding: FragmentHalamanBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.selengkapnya.setOnClickListener {
            val mIntent = Intent(requireActivity(), SumutActivity::class.java)
            startActivity(mIntent)
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHalamanBinding.inflate(layoutInflater, container, false)

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding=null
        }

}