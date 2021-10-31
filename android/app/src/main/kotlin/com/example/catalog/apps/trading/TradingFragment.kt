package com.vynksafe.app.ui.home.apps.trading

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.vynksafe.app.R
import com.vynksafe.app.databinding.FragmentTradingBinding

class TradingFragment : Fragment() {

    private var _binding: FragmentTradingBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTradingBinding.inflate(inflater, container, false)

        return binding.root
    }
}
