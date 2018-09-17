package ssun.pe.kr.myapplication

import android.support.v7.recyclerview.extensions.ListAdapter
import android.support.v7.util.DiffUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import ssun.pe.kr.myapplication.databinding.ItemMain2Binding

class MainAdapter2 : ListAdapter<Item, MainHolder2>(SessionDiff2) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainHolder2 {
        val binding = ItemMain2Binding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MainHolder2(binding)
    }

    override fun onBindViewHolder(holder: MainHolder2, position: Int) {
        holder.bind(getItem(holder.adapterPosition))
    }
}

class MainHolder2(
        private val binding: ItemMain2Binding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: Item) {
        binding.item = item
        binding.position = adapterPosition
        binding.executePendingBindings()
    }
}

object SessionDiff2: DiffUtil.ItemCallback<Item>() {
    override fun areItemsTheSame(oldItem: Item, newItem: Item): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Item, newItem: Item): Boolean {
        return oldItem.color == newItem.color
    }
}