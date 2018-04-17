package com.osapps.capitalslearnproject.fragmentactivity.frags.detail.view

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.osapps.capitalslearnproject.fragmentactivity.frags.detail.presentation.DetailFragmentPresenter

import javax.inject.Inject

import dagger.android.support.AndroidSupportInjection
import dagger.android.support.DaggerFragment

/**
 * Created by osApps on 02/06/2017.
 */

class DetailFragment : DaggerFragment(), DetailFragmentView {

    @Inject lateinit var detailFragmentPresenter: DetailFragmentPresenter

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        detailFragmentPresenter.viewLoaded()
    }

    override fun onDetailFragmentLoaded() {
        Log.v("TEST", "OnDetailFragmentLoaded.")
    }

    companion object {

        fun newInstance(): DetailFragment {
            val args = Bundle()
            val fragment = DetailFragment()
            fragment.arguments = args
            return fragment
        }
    }
}
