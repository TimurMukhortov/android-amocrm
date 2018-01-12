package com.example.timurmuhortov.amocrm.ui.activity

import android.content.Context
import android.content.Intent
import com.example.timurmuhortov.amocrm.ui.base.SingleFragmentActivity
import com.example.timurmuhortov.amocrm.ui.fragment.MainFragment

/**
 * @author: timur.mukhortov
 * date: 12.01.2018
 * time: 2:53
 * @LinkedIn: linkedin.com/in/timurmukhortov
 **/


class MainActivity: SingleFragmentActivity() {

    companion object {
        fun newIntent(context: Context) = Intent(context, MainActivity::class.java)
    }

    override fun createFragment() = MainFragment.newInstance()
}