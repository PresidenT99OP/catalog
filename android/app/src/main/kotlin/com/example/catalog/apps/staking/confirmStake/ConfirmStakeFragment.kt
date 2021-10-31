package com.vynksafe.app.ui.home.apps.staking.confirmStake

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.vynksafe.app.databinding.FragmentConfirmStakeBinding

class ConfirmStakeFragment : Fragment() {

    private var _binding: FragmentConfirmStakeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentConfirmStakeBinding.inflate(inflater, container, false)

        binding.layoutToolbar.txtTitle.text = ""

        return binding.root
    }
}
