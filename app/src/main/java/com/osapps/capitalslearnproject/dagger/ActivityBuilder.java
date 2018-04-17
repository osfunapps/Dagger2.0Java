package com.osapps.capitalslearnproject.dagger;

import com.osapps.capitalslearnproject.fragmentactivity.di.DetailFragmentProvider;
import com.osapps.capitalslearnproject.fragmentactivity.di.FragmentActivityModule;
import com.osapps.capitalslearnproject.fragmentactivity.view.FragmentActivity;
import com.osapps.capitalslearnproject.main.di.MainActivityModule;
import com.osapps.capitalslearnproject.main.view.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity bindMainActivity();

    @ContributesAndroidInjector(modules = {FragmentActivityModule.class, DetailFragmentProvider.class})
    abstract FragmentActivity bindFragmentActivity();

}
