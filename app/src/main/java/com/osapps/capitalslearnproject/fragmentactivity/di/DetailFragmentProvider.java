package com.osapps.capitalslearnproject.fragmentactivity.di;

import com.osapps.capitalslearnproject.fragmentactivity.frags.detail.di.DetailFragmentModule;
import com.osapps.capitalslearnproject.fragmentactivity.frags.detail.view.DetailFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by mertsimsek on 02/06/2017.
 */
@Module
public abstract class DetailFragmentProvider {
    @ContributesAndroidInjector(modules = DetailFragmentModule.class)
    abstract DetailFragment provideDetailFragmentFactory();
}
