package com.example.timurmuhortov.amocrm.ui.base

import android.content.Context
import com.arellomobile.mvp.MvpAppCompatFragment
import dagger.android.support.AndroidSupportInjection

/**
 * @author: timur.mukhortov
 * date: 12.01.2018
 * time: 2:53
 * @LinkedIn: linkedin.com/in/timurmukhortov
 **/


abstract class BaseFragment: MvpAppCompatFragment() {

    override fun onAttach(context: Context?) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }
}