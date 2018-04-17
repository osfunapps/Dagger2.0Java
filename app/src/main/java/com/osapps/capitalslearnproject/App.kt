package com.osapps.capitalslearnproject

import com.osapps.capitalslearnproject.dagger.AppComponent
import com.osapps.capitalslearnproject.dagger.DaggerAppComponent

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

/**
 * todo:
 * [2] notes on project
 * [3] notes in general
 */
/**
 * Created by osApps on 25/05/2017.
 */

class App : DaggerApplication() {


    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        val appComponent = DaggerAppComponent.builder().application(this).build()
        appComponent.inject(this)
        return appComponent
    }
}
