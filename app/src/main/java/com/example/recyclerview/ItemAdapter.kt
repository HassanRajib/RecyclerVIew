package com.example.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.ItemLiBinding


class ItemAdapter(private val itemList:ArrayList<items>):
    RecyclerView.Adapter<ItemAdapter.ViewHolder>() {
        var onClick: ((items) -> Unit)? = null
    class ViewHolder(val binding: ItemLiBinding) : RecyclerView.ViewHolder(binding.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemLiBinding.inflate(
                LayoutInflater.from(parent.context),
                parent, false))
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = itemList[position]

        holder.binding.apply {
            itNa.text = item.name
            itPr.text = item.price

            imageView.setImageResource(item.image)
        }
        holder.itemView.setOnClickListener {
            onClick?.invoke(item)
        }
    }
}