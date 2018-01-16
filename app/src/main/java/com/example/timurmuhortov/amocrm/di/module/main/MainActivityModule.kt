package com.example.timurmuhortov.amocrm.di.module.main

import android.app.Activity
import com.example.timurmuhortov.amocrm.di.scope.ActivityScope
import com.example.timurmuhortov.amocrm.di.scope.FragmentScope
import com.example.timurmuhortov.amocrm.ui.activity.MainActivity
import com.example.timurmuhortov.amocrm.ui.fragment.MainFragment
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * @author: timur.mukhortov
 * date: 12.01.2018
 * time: 2:13
 * @LinkedIn: linkedin.com/in/timurmukhortov
 **/

@Module
abstract class MainActivityModule {

    @FragmentScope
    @ContributesAndroidInjector
    abstract fun mainFragmentInjector(): MainFragment

    @Binds
    @ActivityScope
    abstract fun activity(activity: MainActivity): Activity

}