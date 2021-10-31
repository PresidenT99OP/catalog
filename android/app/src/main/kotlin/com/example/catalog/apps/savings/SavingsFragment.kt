package com.vynksafe.app.ui.home.apps.savings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.vynksafe.app.databinding.FragmentSavingsBinding
import com.vynksafe.app.ui.home.apps.savings.adapter.SavingAdapter
import com.vynksafe.app.util.savingList

class SavingsFragment : Fragment() {

    private var _binding: FragmentSavingsBinding? = null
    private val binding get() = _binding!!
    private lateinit var mAdapter: SavingAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSavingsBinding.inflate(inflater, container, false)

        setupRecycler()

        return binding.root
    }

    private fun setupRecycler() {
        mAdapter = SavingAdapter()
        binding.rvSaving.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = mAdapter
        }
        mAdapter.setData(savingList)
    }
}
