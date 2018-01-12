package com.example.timurmuhortov.amocrm.di.module.main

import com.example.timurmuhortov.amocrm.di.scope.FragmentScope
import com.example.timurmuhortov.amocrm.ui.fragment.MainFragment
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

}