package com.app_knit.base.views.fragments


import android.view.View
import androidx.fragment.app.Fragment
import com.app_knit.base.R
import com.app_knit.base.viewmodels.BaseViewModel
import kotlinx.android.synthetic.main.toolbar.*

/**
 * A simple [Fragment] subclass.
 */
class GroupChats : BaseFragment() {
    override val layoutId: Int
        get() = R.layout.fragment_group_chats
    override val viewModel: BaseViewModel?
        get() = null

    override fun init() {
        tvLeftToolbarTitle.text = "GROUP CHATS"
        ivToolbarActionEnd.setImageResource(R.drawable.ic_add_group)
        ivToolbarActionEnd.visibility = (View.VISIBLE)

    }


}
