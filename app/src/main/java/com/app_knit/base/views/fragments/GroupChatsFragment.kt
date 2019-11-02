package com.app_knit.base.views.fragments


import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.app_knit.base.R
import com.app_knit.base.viewmodels.BaseViewModel
import com.app_knit.base.views.activities.BaseAppCompactActivity
import com.app_knit.base.views.activities.doFragmentTransaction
import com.app_knit.base.views.adapters.BlogRecyclerAdapter
import com.app_knit.base.views.fragments.Datasource.DataSource
import kotlinx.android.synthetic.main.row_blog_list_item.*
import kotlinx.android.synthetic.main.toolbar.*

/**
 * A simple [Fragment] subclass.
 */
class GroupChatsFragment :  BaseRecyclerViewFragment() {
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
        ivToolbarActionEnd.setOnClickListener {  (activity as BaseAppCompactActivity).doFragmentTransaction(fragManager = activity!!.supportFragmentManager,containerViewId = R.id.flFragContainerMain,fragment = SocialVerseFragment(), isAddFragment = false)  }

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

