package com.example.ufrb_problemas.UI.request

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.ufrb_problemas.databinding.RowRequestBinding
import com.example.ufrb_problemas.model.data.Request

class RequestAdapter: ListAdapter<Request, RequestAdapter.ViewHolder>(RequestDiffCallback()) {
    class RequestDiffCallback: DiffUtil.ItemCallback<Request>() {
        override fun areItemsTheSame(oldItem: Request, newItem: Request): Boolean = oldItem.id == newItem.id
        override fun areContentsTheSame(oldItem: Request, newItem: Request): Boolean = oldItem == newItem
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class ViewHolder private constructor(private val binding: RowRequestBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(request: Request) {
            binding.request = request
            binding.executePendingBindings()
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = RowRequestBinding.inflate(layoutInflater, parent, false)

                return ViewHolder(binding)
            }
        }
    }
}