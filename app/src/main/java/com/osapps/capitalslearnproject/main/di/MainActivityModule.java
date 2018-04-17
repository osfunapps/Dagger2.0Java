package com.osapps.capitalslearnproject.main.di;

import com.osapps.capitalslearnproject.main.presentation.ItzikInstance;
import com.osapps.capitalslearnproject.main.presentation.MainPresenter;
import com.osapps.capitalslearnproject.main.presentation.MainPresenterImpl;
import com.osapps.capitalslearnproject.main.presentation.SubItzikInstance;
import com.osapps.capitalslearnproject.main.view.MainActivity;
import com.osapps.capitalslearnproject.main.view.MainView;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class MainActivityModule {

    @Provides
    static MainPresenter provideMainPresenter(MainView mainView, ItzikInstance instance) {
        return new MainPresenterImpl(mainView, instance);
    }

    @Binds
    abstract MainView provideMainView(MainActivity mainActivity);


}
