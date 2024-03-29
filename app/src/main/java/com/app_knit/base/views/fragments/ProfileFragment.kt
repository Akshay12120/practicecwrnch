package com.app_knit.base.views.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.app_knit.base.R
import com.app_knit.base.viewmodels.BaseViewModel
import kotlinx.android.synthetic.main.toolbar.*

/**
 * A simple [Fragment] subclass.
 */
class ProfileFragment : BaseFragment() {
    override val layoutId: Int
        get() = R.layout.fragment_profile
    override val viewModel: BaseViewModel?
        get() = null

    override fun init() {
        tvToolbarTitle.text ="Profile"
        toolbar.elevation = 0f
    }


}
