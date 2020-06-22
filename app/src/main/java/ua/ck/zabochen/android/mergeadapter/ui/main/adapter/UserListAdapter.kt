package ua.ck.zabochen.android.mergeadapter.ui.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.adapter_item_user_list.view.*
import ua.ck.zabochen.android.mergeadapter.R
import ua.ck.zabochen.android.mergeadapter.model.User

class UserListAdapter : RecyclerView.Adapter<UserListAdapter.UserListViewHolder>() {

    private var userList = mutableListOf<User>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserListViewHolder {
        return UserListViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.adapter_item_user_list,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: UserListViewHolder, position: Int) {
        holder.bind(userList[position])
    }

    override fun getItemCount() = if (userList.isNotEmpty()) userList.size else 0

    fun setData(userList: List<User>) {
        this.userList.apply {
            clear()
            addAll(userList)
            notifyDataSetChanged()
        }
    }

    class UserListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(user: User) = with(itemView) {
            // User: Name
            tvUser.text = user.name
        }
    }
}