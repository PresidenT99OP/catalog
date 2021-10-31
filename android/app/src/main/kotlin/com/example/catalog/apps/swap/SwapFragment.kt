package com.vynksafe.app.ui.home.apps.swap

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.vynksafe.app.R
import com.vynksafe.app.databinding.FragmentSwapBinding

class SwapFragment : Fragment() {

    private var _binding: FragmentSwapBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSwapBinding.inflate(inflater, container, false)


        return binding.root
    }
}
