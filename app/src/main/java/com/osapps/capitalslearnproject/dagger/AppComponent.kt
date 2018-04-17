package com.osapps.capitalslearnproject.dagger

import android.app.Application

import com.osapps.capitalslearnproject.App

import javax.inject.Singleton

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.support.AndroidSupportInjectionModule

/**
 * Created by osApps
 */
@Singleton
@Component(modules = [(AndroidSupportInjectionModule::class), (AppModule::class), (ActivityBuilder::class)]) //map of all of the activities and their modules here
interface AppComponent : AndroidInjector<DaggerApplication> {

    fun inject(app: App)  //application injection

    override fun inject(instance: DaggerApplication)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}
