package com.vynksafe.app.ui.home.apps.lending.lendingPin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.vynksafe.app.databinding.FragmentLendingPinBinding

class LendingPinFragment : Fragment() {

    private var _binding: FragmentLendingPinBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLendingPinBinding.inflate(inflater, container, false)

        return binding.root
    }
}
