package ssun.pe.kr.myapplication.ui

import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import ssun.pe.kr.myapplication.data.model.Item
import ssun.pe.kr.myapplication.databinding.ItemMainBinding

class MainAdapter : ListAdapter<Item, MainHolder>(SessionDiff) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainHolder {
        val binding = ItemMainBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MainHolder(binding)
    }

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        holder.bind(getItem(holder.adapterPosition))
    }
}

class MainHolder(
        private val binding: ItemMainBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: Item) {
        binding.item = item
        binding.position = adapterPosition
        binding.executePendingBindings()
    }
}

object SessionDiff: DiffUtil.ItemCallback<Item>() {
    override fun areItemsTheSame(oldItem: Item, newItem: Item): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Item, newItem: Item): Boolean {
        return oldItem.color == newItem.color
    }
}