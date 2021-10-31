package com.vynksafe.app.ui.home.account

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.vynksafe.app.databinding.FragmentAccountBinding
import com.vynksafe.app.ui.home.account.security.SecurityActivity
import com.vynksafe.app.ui.home.account.settings.SettingsActivity
import com.vynksafe.app.ui.home.account.support.SupportActivity
import com.vynksafe.app.ui.home.account.verification.VerificationActivity

class AccountFragment : Fragment() {

    private var _binding: FragmentAccountBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAccountBinding.inflate(inflater, container, false)

        binding.btnSecurity.setOnClickListener {
            startActivity(Intent(requireContext(), SecurityActivity::class.java))
        }
        binding.btnSettings.setOnClickListener {
            startActivity(Intent(requireContext(), SettingsActivity::class.java))
        }
        binding.btnSupport.setOnClickListener {
            startActivity(Intent(requireContext(), SupportActivity::class.java))
        }
        binding.btnVerification.setOnClickListener {
            startActivity(Intent(requireContext(), VerificationActivity::class.java))
        }

        return binding.root
    }
}
