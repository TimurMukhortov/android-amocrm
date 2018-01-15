package com.example.timurmuhortov.amocrm

import android.app.Activity
import android.app.Application
import com.example.timurmuhortov.amocrm.di.component.DaggerAppComponent
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import net.danlew.android.joda.JodaTimeAndroid
import javax.inject.Inject

/**
 * @author: timur.mukhortov
 * date: 12.01.2018
 * time: 2:00
 * @LinkedIn: linkedin.com/in/timurmukhortov
 **/


class AmocrmApplication : Application(), HasActivityInjector {

    @Inject
    protected lateinit var dispatchingActivityInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()

        JodaTimeAndroid.init(this);

        DaggerAppComponent
                .builder()
                .context(this)
                .build()
                .inject(this)
    }

    override fun activityInjector() = dispatchingActivityInjector
}