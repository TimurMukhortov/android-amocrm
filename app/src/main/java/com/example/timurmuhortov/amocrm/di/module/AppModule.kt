package com.example.timurmuhortov.amocrm.di.module

import com.example.timurmuhortov.amocrm.MainActivity
import com.example.timurmuhortov.amocrm.di.module.main.MainActivityModule
import com.example.timurmuhortov.amocrm.di.scope.ActivityScope
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

/**
 * @author: timur.mukhortov
 * date: 12.01.2018
 * time: 2:08
 * @LinkedIn: linkedin.com/in/timurmukhortov
 **/

@Module(includes = arrayOf(AndroidSupportInjectionModule::class))
abstract class AppModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = arrayOf(MainActivityModule::class))
    abstract fun mainActivityInjector(): MainActivity

}