package com.vynksafe.app.ui.home.apps.lending.lendingPreview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.vynksafe.app.databinding.FragmentLendingPreviewBinding

class LendingPreviewFragment : Fragment() {

    private var _binding: FragmentLendingPreviewBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLendingPreviewBinding.inflate(inflater, container, false)

        return binding.root
    }
}
