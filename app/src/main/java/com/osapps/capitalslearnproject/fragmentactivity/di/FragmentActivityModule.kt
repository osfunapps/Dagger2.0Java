package com.osapps.capitalslearnproject.fragmentactivity.di

import com.osapps.capitalslearnproject.dagger.scope.PerFragment
import com.osapps.capitalslearnproject.fragmentactivity.presentation.DetailPresenter
import com.osapps.capitalslearnproject.fragmentactivity.presentation.DetailPresenterImpl
import com.osapps.capitalslearnproject.fragmentactivity.view.DetailView
import com.osapps.capitalslearnproject.fragmentactivity.view.FragmentActivity
import com.osapps.capitalslearnproject.main.presentation.ItzikInstance

import dagger.Binds
import dagger.Module
import dagger.Provides

/**
 * Created by osApps on 30/05/2017.
 */
@Module
class FragmentActivityModule {

    @Provides
    fun provideDetailView(fragmentActivity: FragmentActivity): DetailView = fragmentActivity

    @Provides
    fun provideDetailPresenter(detailView: DetailView, instance: ItzikInstance): DetailPresenter {
        return DetailPresenterImpl(detailView, instance)
    }


}
