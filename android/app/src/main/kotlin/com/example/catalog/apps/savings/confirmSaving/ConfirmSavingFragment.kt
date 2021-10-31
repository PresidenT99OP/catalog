package com.vynksafe.app.ui.home.apps.savings.confirmSaving

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.vynksafe.app.databinding.FragmentConfirmSavingBinding

class ConfirmSavingFragment : Fragment() {

    private var _binding: FragmentConfirmSavingBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentConfirmSavingBinding.inflate(inflater, container, false)

        return binding.root
    }
}
