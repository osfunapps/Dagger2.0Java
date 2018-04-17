package com.osapps.capitalslearnproject.fragmentactivity.frags.detail.presentation

import com.osapps.capitalslearnproject.fragmentactivity.frags.detail.view.DetailFragmentView

import javax.inject.Inject

/**
 * Created by osApps on 02/06/2017.
 */

class DetailFragmentPresenter @Inject
constructor(private var detailFragmentView: DetailFragmentView) {

    fun viewLoaded() {
        detailFragmentView.onDetailFragmentLoaded()
    }
}
