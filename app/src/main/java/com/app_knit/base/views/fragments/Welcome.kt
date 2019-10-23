package com.app_knit.base.views.fragments


import android.os.Bundle
import android.view.*
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment

import com.app_knit.base.R
import com.app_knit.base.viewmodels.BaseViewModel
import com.app_knit.base.views.activities.BaseAppCompactActivity
import com.app_knit.base.views.activities.doFragmentTransaction
import kotlinx.android.synthetic.main.fragment_welcome.*

/**
 * A simple [Fragment] subclass.
 */
class Welcome : BaseFragment() {
    override val layoutId: Int
        get() = R.layout.fragment_welcome
    override val viewModel: BaseViewModel?
        get() = null

    override fun init() {
//        continuebtn3.setOnClickListener { (activity as BaseAppCompactActivity).doFragmentTransaction(fragManager = activity!!.supportFragmentManager,containerViewId = R.id.flFragContainerMain,fragment = ChooseCummunity(), isAddFragment = false) }

    }

    override fun onResume() {
        super.onResume()
        //Makes status bar transparent for this fragment.
        if (activity != null) {
            activity!!.window.statusBarColor = ContextCompat.getColor(requireContext(), R.color.colorTransparent)
            activity!!.window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or
                    View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        }

    }

    override fun onPause() {
        super.onPause()
        //Returns status bar to primary color for other fragments.
        activity?.window?.statusBarColor = ContextCompat.getColor(requireContext(),
                R.color.colorPrimaryDark)
        activity?.window?.decorView?.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR

    }


}
