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

class ItemRecyclerViewAdapter: ListAdapter<Item, ItemRecyclerViewAdapter.ItemViewHolder>( object :
    DiffUtil.ItemCallback<Item>() {
    override fun areItemsTheSame(oldItem: Item, newItem: Item): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Item, newItem: Item): Boolean {
        return oldItem == newItem
    }

}
) {

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
    }



    inner class ItemViewHolder(private val binding: RecyclerviewImgBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind() = with(binding) {
            val item = currentList[adapterPosition]

            Picasso.get()
                .load(item.image)
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_foreground)
                .into(imgVase)
            tvTitle.setText(item.title)
            tvRate.setText(item.rate)
            tvSold.setText(item.sold)
            tvPrice.setText(item.price)
        }
    }


}