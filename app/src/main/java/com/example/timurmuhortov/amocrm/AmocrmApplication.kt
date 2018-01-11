package com.example.timurmuhortov.amocrm

import android.app.Activity
import android.app.Application
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

/**
 * @author: timur.mukhortov
 * date: 12.01.2018
 * time: 2:00
 * @LinkedIn: linkedin.com/in/timurmukhortov
 **/


class AmocrmApplication: Application(), HasActivityInjector{

    @Inject
    protected  lateinit var dispatchingActivityInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()


    }

    override fun activityInjector() = dispatchingActivityInjector
}