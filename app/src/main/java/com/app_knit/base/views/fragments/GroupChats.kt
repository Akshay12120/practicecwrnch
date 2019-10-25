package com.app_knit.base.views.fragments


import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.app_knit.base.R
import com.app_knit.base.viewmodels.BaseViewModel
import kotlinx.android.synthetic.main.toolbar.*

/**
 * A simple [Fragment] subclass.
 */
class GroupChats :  BaseRecyclerViewFragment() {
    override val layoutId: Int
        get() = R.layout.fragment_group_chats
    override val viewModel: BaseViewModel?
        get() = null

    override fun setData() {
        tvLeftToolbarTitle.text = "GROUP CHATS"
        ivToolbarActionEnd.setImageResource(R.drawable.ic_add_group)
        ivToolbarActionEnd.visibility = (View.VISIBLE)
        val data = DataSource.createDataset()
        Blogrecycleradapter.submitList(data)
    }
    private val Blogrecycleradapter = BlogRecyclerAdapter()

    override val recyclerViewAdapter: RecyclerView.Adapter<*>?
        get() = Blogrecycleradapter
    override val layoutManager: RecyclerView.LayoutManager?
        get() = null
    override val isShowRecyclerViewDivider: Boolean
        get() = true

    override fun onPullDownToRefresh() {

    }


}

