package com.example.socialapp


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.app_knit.base.R
import com.app_knit.base.viewmodels.BaseViewModel
import com.app_knit.base.views.activities.BaseAppCompactActivity
import com.app_knit.base.views.activities.doFragmentTransaction
import com.app_knit.base.views.fragments.BaseFragment
import com.app_knit.base.views.fragments.Verification
import kotlinx.android.synthetic.main.fragment_signuppage.*

/**
 * A simple [Fragment] subclass.
 */
class Signuppage : BaseFragment(){
    override val layoutId: Int
        get() = R.layout.fragment_signuppage
    override val viewModel: BaseViewModel?
        get() = null
    override fun init() {
    signverify.setOnClickListener {
        (activity as BaseAppCompactActivity).doFragmentTransaction(fragManager = activity!!.supportFragmentManager, containerViewId = R.id.flFragContainerMain, fragment = Verification(),isAddFragment = false)
    }
    }
}
