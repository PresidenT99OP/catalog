package com.vynksafe.app.ui.home.apps.staking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.vynksafe.app.databinding.FragmentStakingBinding
import com.vynksafe.app.ui.home.apps.staking.adapter.StakingAdapter
import com.vynksafe.app.util.stakingList

class StakingFragment : Fragment() {

    private var _binding: FragmentStakingBinding? = null
    private val binding get() = _binding!!
    private lateinit var mAdapter: StakingAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentStakingBinding.inflate(inflater, container, false)

        setupRecycler()

        return binding.root
    }

    private fun setupRecycler() {
        mAdapter = StakingAdapter()
        binding.rvStaking.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = mAdapter
        }
        mAdapter.setData(stakingList)
    }
}
