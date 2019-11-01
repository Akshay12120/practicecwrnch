package com.app_knit.base.views.fragments


import androidx.fragment.app.Fragment

import com.app_knit.base.R
import com.app_knit.base.viewmodels.BaseViewModel
import com.app_knit.base.views.activities.BaseAppCompactActivity
import com.app_knit.base.views.activities.doFragmentTransaction
import kotlinx.android.synthetic.main.fragment_verification.*
import kotlinx.android.synthetic.main.toolbar.*

/**
 * A simple [Fragment] subclass.
 */
class VerificationFragment : BaseFragment() {
    override val layoutId: Int
        get() = R.layout.fragment_verification
    override val viewModel: BaseViewModel?
        get() = null
    override fun init() {
verifybtn.setOnClickListener { (activity as BaseAppCompactActivity).doFragmentTransaction(fragManager = activity!!.supportFragmentManager, containerViewId = R.id.flFragContainerMain, fragment = ChooseCummunityFragment(),isAddFragment = false) }
   toolbar.elevation = 0f
    }


}
