package com.example.socialapp


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.app_knit.base.R
import com.app_knit.base.viewmodels.BaseViewModel
import com.app_knit.base.views.fragments.BaseFragment
import kotlinx.android.synthetic.main.fragment_reset_password.view.*
import kotlinx.android.synthetic.main.toolbar.*

/**
 * A simple [Fragment] subclass.
 */
class ResetPassword : BaseFragment(){
    override val layoutId: Int
        get() = R.layout.fragment_reset_password
    override val viewModel: BaseViewModel?
        get() = null

    override fun init() {
        tvToolbarTitle.text = "Reset password"
    }

}