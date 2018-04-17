package com.osapps.capitalslearnproject.fragmentactivity.frags.detail.di;

import com.osapps.capitalslearnproject.fragmentactivity.frags.detail.presentation.DetailFragmentPresenter;
import com.osapps.capitalslearnproject.fragmentactivity.frags.detail.view.DetailFragment;
import com.osapps.capitalslearnproject.fragmentactivity.frags.detail.view.DetailFragmentView;

import dagger.Module;
import dagger.Provides;

/**
 * Created by mertsimsek on 02/06/2017.
 */
@Module
public class DetailFragmentModule {

    @Provides
    DetailFragmentView provideDetailFragmentView(DetailFragment detailFragment){
        return detailFragment;
    }

}
