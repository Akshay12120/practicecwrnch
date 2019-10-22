package com.app_knit.base.views.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat

import com.app_knit.base.R
import com.app_knit.base.viewmodels.BaseViewModel
import com.app_knit.base.views.activities.BaseAppCompactActivity
import com.app_knit.base.views.activities.doFragmentTransaction
import com.bumptech.glide.load.engine.Resource
import com.example.socialapp.ResetPassword
import kotlinx.android.synthetic.main.fragment_verification.*

/**
 * A simple [Fragment] subclass.
 */
class Verification : BaseFragment() {
    override val layoutId: Int
        get() = R.layout.fragment_verification
    override val viewModel: BaseViewModel?
        get() = null
    override fun init() {
verifybtn.setOnClickListener { (activity as BaseAppCompactActivity).doFragmentTransaction(fragManager = activity!!.supportFragmentManager, containerViewId = R.id.flFragContainerMain, fragment = ChooseCummunity()) }
    }


}
