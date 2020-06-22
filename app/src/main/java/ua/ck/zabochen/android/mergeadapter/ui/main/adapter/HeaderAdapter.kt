package ua.ck.zabochen.android.mergeadapter.ui.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ua.ck.zabochen.android.mergeadapter.R

class HeaderAdapter : RecyclerView.Adapter<HeaderAdapter.HeaderViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeaderViewHolder {
        return HeaderViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.adapter_item_header,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: HeaderViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount() = 1

    inner class HeaderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind() {
        }
    }
}