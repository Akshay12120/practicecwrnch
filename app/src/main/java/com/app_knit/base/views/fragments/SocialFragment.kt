package com.example.socialapp


import androidx.fragment.app.Fragment
import com.app_knit.base.R
import com.app_knit.base.viewmodels.BaseViewModel
import com.app_knit.base.views.activities.BaseAppCompactActivity
import com.app_knit.base.views.activities.doFragmentTransaction
import com.app_knit.base.views.fragments.BaseFragment
import kotlinx.android.synthetic.main.fragment_social.*

/**
 * A simple [Fragment] subclass.
 */
class SocialFragment : BaseFragment(){
    override val layoutId: Int
        get() = R.layout.fragment_social
    override val viewModel: BaseViewModel?
        get() = null

    override fun init() {
        loginbtn.setOnClickListener{
            (activity as BaseAppCompactActivity).doFragmentTransaction(fragManager = activity!!.supportFragmentManager, containerViewId = R.id.flFragContainerMain, fragment = LoginpageFragment(),isAddFragment = false)
        }
        signupbtn1.setOnClickListener {
            (activity as BaseAppCompactActivity).doFragmentTransaction(fragManager = activity!!.supportFragmentManager, containerViewId = R.id.flFragContainerMain, fragment = SignupPageFragment(),isAddFragment = false)
        }
    }

}


