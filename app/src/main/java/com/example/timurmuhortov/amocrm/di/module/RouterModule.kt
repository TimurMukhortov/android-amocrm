package com.example.timurmuhortov.amocrm.di.module

import dagger.Module
import dagger.Provides
import ru.terrakok.cicerone.Cicerone

/**
 * @author: timur.mukhortov
 * date: 12.01.2018
 * time: 2:16
 * @LinkedIn: linkedin.com/in/timurmukhortov
 **/

@Module
class RouterModule {

    private val cicerone = Cicerone.create()

    @Provides
    fun provideRouting() = cicerone.router

    @Provides
    fun provideNavigationHolder() = cicerone.navigatorHolder
}