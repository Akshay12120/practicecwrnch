package com.app_knit.base.views.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.app_knit.base.R
import com.app_knit.base.viewmodels.BaseViewModel

/**
 * A simple [Fragment] subclass.
 */
class TrouvailleFragment : BaseFragment() {
    override val layoutId: Int
        get() = R.layout.fragment_trouvaille
    override val viewModel: BaseViewModel?
        get() = null

    override fun init() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}
