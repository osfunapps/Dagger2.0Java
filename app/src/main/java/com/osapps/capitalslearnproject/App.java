package com.osapps.capitalslearnproject;

import com.osapps.capitalslearnproject.dagger.AppComponent;
import com.osapps.capitalslearnproject.dagger.DaggerAppComponent;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;


/**
 * Created by mertsimsek on 25/05/2017.
 */

public class App extends DaggerApplication {


    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        AppComponent appComponent = DaggerAppComponent.builder().application(this).build();
        appComponent.inject(this);
        return appComponent;
    }
}
