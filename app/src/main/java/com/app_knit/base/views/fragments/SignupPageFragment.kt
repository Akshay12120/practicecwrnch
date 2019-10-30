package com.example.socialapp


import androidx.fragment.app.Fragment
import com.app_knit.base.R
import com.app_knit.base.viewmodels.BaseViewModel
import com.app_knit.base.views.activities.BaseAppCompactActivity
import com.app_knit.base.views.activities.doFragmentTransaction
import com.app_knit.base.views.fragments.BaseFragment
import com.app_knit.base.views.fragments.VerificationFragment
import kotlinx.android.synthetic.main.fragment_signuppage.*

/**
 * A simple [Fragment] subclass.
 */
class SignupPageFragment : BaseFragment(){
    override val layoutId: Int
        get() = R.layout.fragment_signuppage
    override val viewModel: BaseViewModel?
        get() = null
    override fun init() {
    signverify.setOnClickListener {
        (activity as BaseAppCompactActivity).doFragmentTransaction(fragManager = activity!!.supportFragmentManager, containerViewId = R.id.flFragContainerMain, fragment = VerificationFragment(),isAddFragment = false)
    }
    }
}
