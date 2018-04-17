package com.osapps.capitalslearnproject.fragmentactivity.presentation;

import com.osapps.capitalslearnproject.fragmentactivity.view.DetailView;
import com.osapps.capitalslearnproject.main.presentation.ItzikInstance;

import javax.inject.Inject;


/**
 * Created by mertsimsek on 30/05/2017.
 */

public class DetailPresenterImpl implements DetailPresenter{

    DetailView detailView;
    ItzikInstance instance;

    @Inject
    public DetailPresenterImpl(DetailView detailView, ItzikInstance instance) {
        this.detailView = detailView;
        this.instance = instance;
    }

    public void loadDetail(){
        instance.talkItzik();
        detailView.onDetailLoaded();
    }
}
