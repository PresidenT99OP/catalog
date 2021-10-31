package com.vynksafe.app.ui.home.apps.lending.lendingConfirm

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.vynksafe.app.databinding.FragmentLendingConfirmBinding

class LendingConfirmFragment : Fragment() {

    private var _binding: FragmentLendingConfirmBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLendingConfirmBinding.inflate(inflater, container, false)

        return binding.root
    }
}
