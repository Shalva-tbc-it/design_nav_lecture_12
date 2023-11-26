package com.example.designnavigation.adapter

import android.content.res.ColorStateList
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.designnavigation.data_model.Color
import com.example.designnavigation.data_model.Item
import com.example.designnavigation.databinding.RecyclerviewCircleBinding

class ColorRecyclerViewAdapter: RecyclerView.Adapter<ColorRecyclerViewAdapter.ColorViewHolder>() {

    private var colors = listOf<Color>()
    private var onItemClickListener: ((item: Item) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ColorViewHolder {

        return ColorViewHolder(
            RecyclerviewCircleBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = colors.size

    override fun onBindViewHolder(holder: ColorViewHolder, position: Int) {
        val current = colors[position]
        holder.bind(current)
    }

    fun setOnItemClickListener(listener: (item: Item) -> Unit) {
        onItemClickListener = listener
    }

    fun setData(color: List<Color>) {
        colors = color
        notifyItemChanged(color.size)
    }

    inner class ColorViewHolder(private val binding: RecyclerviewCircleBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(color: Color) {
            binding.imgCircle.backgroundTintList =
                ColorStateList.valueOf(ContextCompat.getColor(itemView.context, color.circleColor))

        }


    }

}