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
class ChooseRegion :BaseFragment() {
    override val layoutId: Int
        get() = R.layout.fragment_choose_region
    override val viewModel: BaseViewModel?
        get() = null

    override fun init() {
tvToolbarTitle.text="Choose Region"
        ivToolbarActionEnd.setImageResource(R.drawable.ic_search)
        ivToolbarActionEnd.visibility = (View.VISIBLE);
    }


}
