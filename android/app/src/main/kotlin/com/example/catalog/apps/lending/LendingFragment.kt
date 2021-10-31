package com.vynksafe.app.ui.home.apps.lending

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.vynksafe.app.databinding.FragmentLendingBinding
import com.vynksafe.app.databinding.FragmentLendingConfirmBinding
import com.vynksafe.app.databinding.FragmentLendingPinBinding
import com.vynksafe.app.ui.home.apps.lending.adapter.LendingAdapter
import com.vynksafe.app.util.lendingList

class LendingFragment : Fragment() {

    private var _binding: FragmentLendingBinding? = null
    private val binding get() = _binding!!
    private lateinit var mAdapter: LendingAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLendingBinding.inflate(inflater, container, false)

//        setupRecycler()
        return binding.root
    }

//    private fun setupRecycler() {
//        mAdapter = LendingAdapter()
//        binding.rvLending.apply {
//            layoutManager = LinearLayoutManager(requireContext())
//            adapter = mAdapter
//        }
//        mAdapter.setData(lendingList)
//    }
}
