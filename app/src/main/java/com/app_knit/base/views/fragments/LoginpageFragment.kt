package com.example.socialapp


import androidx.fragment.app.Fragment
import com.app_knit.base.R
import com.app_knit.base.viewmodels.BaseViewModel
import com.app_knit.base.views.activities.BaseAppCompactActivity
import com.app_knit.base.views.activities.doFragmentTransaction
import com.app_knit.base.views.fragments.BaseFragment
import kotlinx.android.synthetic.main.fragment_loginpage.*

/**
 * A simple [Fragment] subclass.
 */
class LoginpageFragment : BaseFragment() {
    override val layoutId: Int
        get() = R.layout.fragment_loginpage
    override val viewModel: BaseViewModel?
        get() = null
    override fun init() {
        forgtPswrd.setOnClickListener {
            (activity as BaseAppCompactActivity).doFragmentTransaction(fragManager = activity!!.supportFragmentManager, containerViewId = R.id.flFragContainerMain, fragment = ResetPasswordFragment(),isAddFragment = false)
        }
        signupbtn.setOnClickListener {
            (activity as BaseAppCompactActivity).doFragmentTransaction(fragManager = activity!!.supportFragmentManager, containerViewId = R.id.flFragContainerMain, fragment = SignupPageFragment(),isAddFragment = false)
        }
    }
}