package com.osapps.capitalslearnproject.fragmentactivity.frags.detail.di

import com.osapps.capitalslearnproject.dagger.scope.PerFragment
import com.osapps.capitalslearnproject.fragmentactivity.frags.detail.presentation.DetailFragmentPresenter
import com.osapps.capitalslearnproject.fragmentactivity.frags.detail.view.DetailFragment
import com.osapps.capitalslearnproject.fragmentactivity.frags.detail.view.DetailFragmentView

import dagger.Module
import dagger.Provides

/**
 * Created by osApps on 02/06/2017.
 */
@Module
@PerFragment
class DetailFragmentModule {

    @Provides
    internal fun provideDetailFragmentView(detailFragment: DetailFragment): DetailFragmentView {
        return detailFragment
    }

}
