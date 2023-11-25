package com.example.designnavigation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.designnavigation.R
import com.example.designnavigation.data_model.Item
import com.example.designnavigation.databinding.RecyclerviewImgBinding
import com.squareup.picasso.Picasso

class ItemRecyclerViewAdapter : ListAdapter<Item, ItemRecyclerViewAdapter.ItemViewHolder>(object :
    DiffUtil.ItemCallback<Item>() {
    override fun areItemsTheSame(oldItem: Item, newItem: Item): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Item, newItem: Item): Boolean {
        return oldItem == newItem
    }

}
) {

    private var onItemClickListener: ((item: Item) -> Unit)? = null

    fun setOnItemClickListener(listener: (item: Item) -> Unit) {
        onItemClickListener = listener
    }

    fun setData(item: MutableList<Item>) {
        submitList(item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            RecyclerviewImgBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind()
        holder.listener()
    }


    inner class ItemViewHolder(private val binding: RecyclerviewImgBinding) :
        RecyclerView.ViewHolder(binding.root) {


        fun bind() = with(binding) {

            val item = currentList[adapterPosition]

            Picasso.get()
                .load(item.image[0])
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_foreground)
                .into(imgVase)
            tvTitle.setText(item.title)
            tvRate.setText(item.rate)
            tvSold.setText(item.sold)
            tvPrice.setText(item.price)
        }

        fun listener() = with(binding) {

            val item = currentList[adapterPosition]

            binding.root.setOnClickListener {
                onItemClickListener?.invoke(item)
            }
        }
    }


}