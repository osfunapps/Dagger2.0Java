package com.osapps.capitalslearnproject.dagger

import com.osapps.capitalslearnproject.dagger.scope.PerActivity
import com.osapps.capitalslearnproject.fragmentactivity.di.DetailFragmentProvider
import com.osapps.capitalslearnproject.fragmentactivity.di.FragmentActivityModule
import com.osapps.capitalslearnproject.fragmentactivity.view.FragmentActivity
import com.osapps.capitalslearnproject.main.di.MainActivityModule
import com.osapps.capitalslearnproject.main.view.MainActivity

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {

    @PerActivity
    @ContributesAndroidInjector(modules = [(MainActivityModule::class)])
    internal abstract fun bindMainActivity(): MainActivity

    @PerActivity
    @ContributesAndroidInjector(modules = [(FragmentActivityModule::class), (DetailFragmentProvider::class)])
    internal abstract fun bindFragmentActivity(): FragmentActivity

}
