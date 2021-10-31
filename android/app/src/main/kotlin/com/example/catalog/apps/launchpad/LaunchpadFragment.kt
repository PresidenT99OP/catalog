package com.vynksafe.app.ui.home.apps.launchpad

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.vynksafe.app.databinding.FragmentLaunchpadBinding
import com.vynksafe.app.ui.home.apps.launchpad.adapter.LaunchpadAdapter
import com.vynksafe.app.ui.home.apps.launchpad.projectDetails.ProjectDetailsActivity
import com.vynksafe.app.util.launchpadList

class LaunchpadFragment : Fragment() {

    private var _binding: FragmentLaunchpadBinding? = null
    private val binding get() = _binding!!
    private lateinit var mAdapter: LaunchpadAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLaunchpadBinding.inflate(inflater, container, false)

        setupRecycler()

        binding.roottt.setOnClickListener {
            startActivity(Intent(requireContext(), ProjectDetailsActivity::class.java))
        }

        return binding.root
    }

    private fun setupRecycler() {
        mAdapter = LaunchpadAdapter()
        binding.rvLaunchpad.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = mAdapter
        }
        mAdapter.setData(launchpadList)
    }
}
