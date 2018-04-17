package com.osapps.capitalslearnproject.dagger;

import android.app.Application;

import com.osapps.capitalslearnproject.App;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by osApps
 */
@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class, //google's generic injection
        AppModule.class, //app scope injections in this module
        ActivityBuilder.class}) //map of all of the activities and their modules here

public interface AppComponent extends AndroidInjector<DaggerApplication> {

    void inject(App app); //application injection

    @Override
    void inject(DaggerApplication instance);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);
        AppComponent build();
    }
}
