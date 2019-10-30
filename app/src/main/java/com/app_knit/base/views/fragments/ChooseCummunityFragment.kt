package com.app_knit.base.views.fragments


import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app_knit.base.R
import com.app_knit.base.repository.models.PostCommunity
import com.app_knit.base.viewmodels.BaseViewModel
import com.app_knit.base.views.activities.BaseAppCompactActivity
import com.app_knit.base.views.activities.doFragmentTransaction
import com.app_knit.base.views.adapters.CommunityRecyclerAdapeter
import com.app_knit.base.views.fragments.Datasource.CommunityData
import kotlinx.android.synthetic.main.fragment_choose_cummunity.*
import kotlinx.android.synthetic.main.fragment_choose_region.*
import kotlinx.android.synthetic.main.toolbar.*

/**
 * A simple [Fragment] subclass.
 */
class ChooseCummunityFragment : BaseRecyclerViewFragment() {

    override val layoutId: Int
        get() = R.layout.fragment_choose_cummunity
    override val viewModel: BaseViewModel?
        get() = null

    override fun setData() {
        tvToolbarTitle.text = "Choose a Community"
        ivToolbarActionEnd.setImageResource(R.drawable.ic_search)
        ivToolbarActionEnd.visibility = (View.VISIBLE);
        continuebtn.setOnClickListener { (activity as BaseAppCompactActivity).doFragmentTransaction(fragManager = activity!!.supportFragmentManager, containerViewId = R.id.flFragContainerMain, fragment = ChooseRegionFragment(), isAddFragment = false) }
        val data  = CommunityData.createData()
        communityRecyclerAdapeter.submitList(data)
    }
    private val communityRecyclerAdapeter by lazy { CommunityRecyclerAdapeter(requireContext()) }
    override val recyclerViewAdapter: RecyclerView.Adapter<*>?
        get() = communityRecyclerAdapeter
    override val layoutManager: RecyclerView.LayoutManager?
        get() = GridLayoutManager(context, 2, GridLayoutManager.HORIZONTAL, false)
    override val isShowRecyclerViewDivider: Boolean
        get() = false

    override fun onPullDownToRefresh() {

    }


}
