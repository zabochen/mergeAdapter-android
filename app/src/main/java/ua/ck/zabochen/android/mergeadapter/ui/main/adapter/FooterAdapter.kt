package ua.ck.zabochen.android.mergeadapter.ui.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ua.ck.zabochen.android.mergeadapter.R

class FooterAdapter : RecyclerView.Adapter<FooterAdapter.FooterViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FooterViewHolder {
        return FooterViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.adapter_item_footer,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: FooterViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount() = 1

    inner class FooterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind() {
        }
    }
}