package github.hongbeomi.randomcat.ui.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.ViewCompat
import androidx.databinding.DataBindingUtil
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import github.hongbeomi.randomcat.R
import github.hongbeomi.randomcat.databinding.ItemMainBinding
import github.hongbeomi.randomcat.model.Cat

class MainAdapter(
    private val onClick : (String?) -> Unit
) : PagingDataAdapter<Cat, MainAdapter.MainViewHolder>(DiffCallback) {

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return DataBindingUtil.inflate<ItemMainBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_main,
            parent,
            false
        ).let {
            it.imageViewItemMain.layoutParams.apply {
                height = parent.width / 3
            }
            MainViewHolder(it)
        }
    }

    inner class MainViewHolder(private val binding: ItemMainBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(cat: Cat?) {
            binding.apply {
                url = cat?.url
                ViewCompat.setTransitionName(imageViewItemMain, cat?.id)
                imageViewItemMain.setOnClickListener { onClick(cat?.url) }
                executePendingBindings()
            }
        }
    }

    object DiffCallback : DiffUtil.ItemCallback<Cat>() {
        override fun areItemsTheSame(oldItem: Cat, newItem: Cat) = oldItem.id == newItem.id
        override fun areContentsTheSame(oldItem: Cat, newItem: Cat) = oldItem == newItem
    }

}