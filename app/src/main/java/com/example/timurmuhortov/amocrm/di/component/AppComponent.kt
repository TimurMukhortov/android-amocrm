package com.example.timurmuhortov.amocrm.di.component

import android.content.Context
import com.example.timurmuhortov.amocrm.AmocrmApplication
import com.example.timurmuhortov.amocrm.di.module.AppModule
import com.example.timurmuhortov.amocrm.di.module.NetworkModule
import com.example.timurmuhortov.amocrm.di.module.RepositoryModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

/**
 * @author: timur.mukhortov
 * date: 12.01.2018
 * time: 1:55
 * @LinkedIn: linkedin.com/in/timurmukhortov
 **/

@Singleton
@Component(modules = arrayOf(
        AppModule::class,
        RepositoryModule::class,
        NetworkModule::class
))
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun context(context: Context): Builder
        fun build(): AppComponent
    }

    fun inject(application: AmocrmApplication)
}