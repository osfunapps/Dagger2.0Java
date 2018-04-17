package com.osapps.capitalslearnproject.fragmentactivity.di

import com.osapps.capitalslearnproject.fragmentactivity.frags.detail.di.DetailFragmentModule
import com.osapps.capitalslearnproject.fragmentactivity.frags.detail.view.DetailFragment

import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by osApps on 02/06/2017.
 */
@Module
abstract class DetailFragmentProvider {
    @ContributesAndroidInjector(modules = [DetailFragmentModule::class]) //the specific module of the fragment
    internal abstract fun provideDetailFragmentFactory(): DetailFragment
}
