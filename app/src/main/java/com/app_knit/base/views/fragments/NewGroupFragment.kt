package com.app_knit.base.views.fragments


import androidx.fragment.app.Fragment
import android.view.View

import com.app_knit.base.R
import com.app_knit.base.viewmodels.BaseViewModel
import com.app_knit.base.views.activities.BaseAppCompactActivity
import com.app_knit.base.views.activities.doFragmentTransaction
import kotlinx.android.synthetic.main.row_blog_list_item.*
import kotlinx.android.synthetic.main.toolbar.*

/**
 * A simple [Fragment] subclass.
 */
class NewGroupFragment : BaseFragment() {
    override val layoutId: Int
        get() = R.layout.fragment_new_group
    override val viewModel: BaseViewModel?
        get() = null

    override fun init() {
      tvLeftToolbarTitle.text = "New Group"
        tvToolbarHashtag.text = "Add Subject"
        tvToolbarHashtag.textSize =14f
        tvToolbarActionEnd.text  = "Done"
        //tvToolbarActionEnd.setOnClickListener { (activity as BaseAppCompactActivity).doFragmentTransaction(fragManager = activity!!.supportFragmentManager,containerViewId = R.id.flFragContainerMain,fragment = ProfileFragment(),isAddFragment = false) }
        tvToolbarActionEnd.setOnClickListener {
            (activity as BaseAppCompactActivity).doFragmentTransaction(fragManager = activity!!.supportFragmentManager, containerViewId = R.id.flFragContainerMain, fragment = GroupChatsFragment(),isAddFragment = false)
        }
        tvToolbarActionEnd.visibility = (View.VISIBLE)




    }


}
