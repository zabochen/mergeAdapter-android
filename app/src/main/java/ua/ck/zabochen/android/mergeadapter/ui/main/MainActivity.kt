package ua.ck.zabochen.android.mergeadapter.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.MergeAdapter
import kotlinx.android.synthetic.main.activity_main.*
import ua.ck.zabochen.android.mergeadapter.R
import ua.ck.zabochen.android.mergeadapter.model.User
import ua.ck.zabochen.android.mergeadapter.ui.main.adapter.FooterAdapter
import ua.ck.zabochen.android.mergeadapter.ui.main.adapter.HeaderAdapter
import ua.ck.zabochen.android.mergeadapter.ui.main.adapter.UserListAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerView()
    }

    private fun initRecyclerView() = with(rvUserList) {
        layoutManager = LinearLayoutManager(this@MainActivity)

        // Adapters
        val headerAdapter = HeaderAdapter()
        val userAdapter = UserListAdapter().apply { setData(userList = getUserList()) }
        val footerAdapter = FooterAdapter()
        adapter = MergeAdapter(headerAdapter, userAdapter, footerAdapter)
    }

    private fun getUserList() = MutableList(100) {
        User(it, "User_$it")
    }
}