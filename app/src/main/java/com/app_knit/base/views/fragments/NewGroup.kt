package com.app_knit.base.views.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.app_knit.base.R
import com.app_knit.base.viewmodels.BaseViewModel
import kotlinx.android.synthetic.main.fragment_base_tab_layout.*
import kotlinx.android.synthetic.main.toolbar.*

/**
 * A simple [Fragment] subclass.
 */
class NewGroup : BaseFragment() {
    override val layoutId: Int
        get() = R.layout.fragment_new_group
    override val viewModel: BaseViewModel?
        get() = null

    override fun init() {
      tvLeftToolbarTitle.text = "New Group"
        tvToolbarHashtag.text = "Add Subject"
        tvToolbarHashtag.textSize =14f
        tvToolbarActionEnd.text  = "Done"
        tvToolbarActionEnd.visibility = (View.VISIBLE)


    }


}