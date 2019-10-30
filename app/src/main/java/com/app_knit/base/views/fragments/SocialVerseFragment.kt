package com.app_knit.base.views.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import com.app_knit.base.R
import com.app_knit.base.viewmodels.BaseViewModel
import com.app_knit.base.views.adapters.SocialVerseRecyclerAdapter
import com.app_knit.base.views.fragments.Datasource.SocialverseData
import kotlinx.android.synthetic.main.toolbar.*

/**
 * A simple [Fragment] subclass.
 */
class SocialVerseFragment : BaseRecyclerViewFragment(){
    override val layoutId: Int
        get() = R.layout.fragment_socialverse
    override val viewModel: BaseViewModel?
        get() = null

    override fun setData() {
        tvToolbarTitle.text = "Socialverse"
        ivToolbarActionEnd.setImageResource(R.drawable.ic_notification)
        ivToolbarActionEnd.visibility = (View.VISIBLE)
        val data = SocialverseData.dataset()
        socialVerseRecyclerAdapter.submitList(data)
    }
        private val socialVerseRecyclerAdapter = SocialVerseRecyclerAdapter()
    override val recyclerViewAdapter: RecyclerView.Adapter<*>?
        get() = socialVerseRecyclerAdapter
    override val layoutManager: RecyclerView.LayoutManager?
        get() = null
    override val isShowRecyclerViewDivider: Boolean
        get() = true

    override fun onPullDownToRefresh() {

    }



}
