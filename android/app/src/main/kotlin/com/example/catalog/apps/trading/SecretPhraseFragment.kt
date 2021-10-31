package com.vynksafe.app.ui.home.account.security.backup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.vynksafe.app.databinding.FragmentSecretPhraseBinding

class SecretPhraseFragment : Fragment() {

    private var _binding: FragmentSecretPhraseBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSecretPhraseBinding.inflate(inflater, container, false)

        binding.customToolbar.txtTitle.text = "Backup"

        return binding.root
    }
}
