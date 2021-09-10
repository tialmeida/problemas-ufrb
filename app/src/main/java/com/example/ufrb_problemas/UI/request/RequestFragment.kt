package com.example.ufrb_problemas.UI.request

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.ufrb_problemas.R
import com.example.ufrb_problemas.databinding.FragmentRequestBinding

class RequestFragment : Fragment() {
    private lateinit var binding: FragmentRequestBinding
    private lateinit var viewModel: RequestViewModel
    private lateinit var requestAdapter: RequestAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_request, container, false)
        viewModel = ViewModelProvider(this).get(RequestViewModel::class.java)

        setupViews()
        setupObservables()

        return binding.root
    }

    private fun setupViews() {
        requestAdapter = RequestAdapter()
        binding.recyclerViewRequests.adapter = requestAdapter
    }

    private fun setupObservables() {
        viewModel.requests.observe(viewLifecycleOwner, Observer {
            it ?: return@Observer
            requestAdapter.submitList(it)
        })
    }
}