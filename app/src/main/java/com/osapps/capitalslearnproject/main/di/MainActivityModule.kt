package com.osapps.capitalslearnproject.main.di

import com.osapps.capitalslearnproject.dagger.scope.PerActivity
import com.osapps.capitalslearnproject.main.presentation.ItzikInstance
import com.osapps.capitalslearnproject.main.presentation.MainPresenter
import com.osapps.capitalslearnproject.main.presentation.MainPresenterImpl
import com.osapps.capitalslearnproject.main.presentation.SubItzikInstance
import com.osapps.capitalslearnproject.main.view.MainActivity
import com.osapps.capitalslearnproject.main.view.MainView

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule {

    @Provides
    fun provideMainView(mainActivity: MainActivity) : MainView = mainActivity

    @Provides
    @PerActivity
    fun provideMainPresenter(mainView: MainView, instance: ItzikInstance): MainPresenter {
        return MainPresenterImpl(mainView, instance)
    }


}
