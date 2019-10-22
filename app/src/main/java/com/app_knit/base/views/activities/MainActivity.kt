package com.app_knit.base.views.activities

import android.content.Intent
import com.app_knit.base.R
import com.example.socialapp.Social


class MainActivity : BaseAppCompactActivity() {

    override val layoutId: Int
        get() = R.layout.activity_main

    override val isMakeStatusBarTransparent: Boolean
        get() = true

    override fun init() {

        doFragmentTransaction(fragManager = supportFragmentManager, containerViewId = R.id.flFragContainerMain, fragment = Social())

        // check if app is restarted from launcher icon then close redundant activity
        if (!isTaskRoot
                && intent.hasCategory(Intent.CATEGORY_LAUNCHER)
                && intent.action != null
                && intent.action == Intent.ACTION_MAIN) {
            finish()
            return
        }
    }
}
