package ssun.pe.kr.myapplication.ui

import android.content.pm.ApplicationInfo
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import ssun.pe.kr.myapplication.databinding.ItemMain2Binding

class MainAdapter2 : ListAdapter<ApplicationInfo, MainHolder2>(SessionDiff2) {
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

    fun bind(info: ApplicationInfo) {
        itemView.context.packageManager.let { pm ->
            binding.info = info
            binding.name = pm.getApplicationLabel(info).toString()
            binding.icon = info.loadIcon(pm)
            binding.executePendingBindings()
        }
    }
}

object SessionDiff2: DiffUtil.ItemCallback<ApplicationInfo>() {
    override fun areItemsTheSame(oldItem: ApplicationInfo, newItem: ApplicationInfo): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: ApplicationInfo, newItem: ApplicationInfo): Boolean {
        return oldItem.packageName == newItem.packageName
    }
}