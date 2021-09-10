package com.example.ufrb_problemas.UI.alert

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.ufrb_problemas.R
import com.example.ufrb_problemas.databinding.FragmentAlertBinding

class AlertFragment : Fragment() {
    private lateinit var binding: FragmentAlertBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_alert, container, false)
        return binding.root
    }
}