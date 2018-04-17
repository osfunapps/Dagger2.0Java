package com.osapps.capitalslearnproject.fragmentactivity.frags.detail.presentation;

import com.osapps.capitalslearnproject.fragmentactivity.frags.detail.view.DetailFragmentView;

import javax.inject.Inject;

/**
 * Created by mertsimsek on 02/06/2017.
 */

public class DetailFragmentPresenter {

    DetailFragmentView detailFragmentView;

    @Inject
    public DetailFragmentPresenter(DetailFragmentView detailFragmentView) {
        this.detailFragmentView = detailFragmentView;
    }

    public void viewLoaded() {
        detailFragmentView.onDetailFragmentLoaded();
    }
}
