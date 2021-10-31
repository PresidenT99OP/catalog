package com.vynksafe.app.ui.home.apps.trading.tradingBuy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.vynksafe.app.databinding.FragmentTradingBuyBinding

class TradingBuyFragment : Fragment() {

    private var _binding: FragmentTradingBuyBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTradingBuyBinding.inflate(inflater, container, false)

        return binding.root
    }
}
