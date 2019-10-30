package com.app_knit.base.views.fragments


import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app_knit.base.R
import com.app_knit.base.viewmodels.BaseViewModel
import com.app_knit.base.views.activities.BaseAppCompactActivity
import com.app_knit.base.views.activities.doFragmentTransaction
import kotlinx.android.synthetic.main.fragment_choose_region.*
import kotlinx.android.synthetic.main.toolbar.*

/**
 * A simple [Fragment] subclass.
 */
class ChooseRegion : BaseRecyclerViewFragment() {

    override val layoutId: Int
        get() = R.layout.fragment_choose_region

    override val viewModel: BaseViewModel?
        get() = null

    override fun setData() {

        tvToolbarTitle.text = "Choose Region"
        ivToolbarActionEnd.setImageResource(R.drawable.ic_search)
        ivToolbarActionEnd.visibility = (View.VISIBLE);
        continubtn2.setOnClickListener { (activity as BaseAppCompactActivity).doFragmentTransaction(fragManager = activity!!.supportFragmentManager, containerViewId = R.id.flFragContainerMain, fragment = Welcome(), isAddFragment = false) }
        val data = PostSource.createDataset1()
        Regionrecycleradapter.submitList(data)

    }

    private val Regionrecycleradapter by lazy { RegionRecyclerAdapter(requireContext()) }

    override val recyclerViewAdapter: RecyclerView.Adapter<*>?
        get() = Regionrecycleradapter

    override val layoutManager: RecyclerView.LayoutManager?
        get() = GridLayoutManager(context, 2, GridLayoutManager.HORIZONTAL, false)
    //get() = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
    override val isShowRecyclerViewDivider: Boolean
        get() = false

    override fun onPullDownToRefresh() {

    }


}
