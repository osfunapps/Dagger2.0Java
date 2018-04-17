package com.osapps.capitalslearnproject.fragmentactivity.view;

import android.os.Bundle;
import android.util.Log;

import com.osapps.capitalslearnproject.R;
import com.osapps.capitalslearnproject.fragmentactivity.frags.detail.view.DetailFragment;
import com.osapps.capitalslearnproject.fragmentactivity.presentation.DetailPresenter;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

/**
 * Created by mertsimsek on 25/05/2017.
 */

public class FragmentActivity extends DaggerAppCompatActivity implements DetailView {

    @Inject
    DetailPresenter detailPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        detailPresenter.loadDetail();

        if (savedInstanceState == null)
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.container, DetailFragment.newInstance())
                    .commitAllowingStateLoss();
    }

    @Override
    public void onDetailLoaded() {
        Log.v("TEST", "Detail is loaded");
    }

}
