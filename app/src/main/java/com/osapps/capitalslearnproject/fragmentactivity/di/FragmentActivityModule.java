package com.osapps.capitalslearnproject.fragmentactivity.di;

import com.osapps.capitalslearnproject.fragmentactivity.presentation.DetailPresenter;
import com.osapps.capitalslearnproject.fragmentactivity.presentation.DetailPresenterImpl;
import com.osapps.capitalslearnproject.fragmentactivity.view.DetailView;
import com.osapps.capitalslearnproject.fragmentactivity.view.FragmentActivity;
import com.osapps.capitalslearnproject.main.presentation.ItzikInstance;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Created by mertsimsek on 30/05/2017.
 */
@Module
public abstract class FragmentActivityModule {

    @Provides
    static DetailPresenter provideDetailPresenter(DetailView detailView, ItzikInstance instance) {
        return new DetailPresenterImpl(detailView, instance);
    }

    @Binds
    abstract DetailView provideDetailView(FragmentActivity fragmentActivity);



}
