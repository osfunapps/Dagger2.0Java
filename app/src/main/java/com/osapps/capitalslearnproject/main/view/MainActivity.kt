package com.osapps.capitalslearnproject.main.view

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View

import com.osapps.capitalslearnproject.R
import com.osapps.capitalslearnproject.fragmentactivity.view.FragmentActivity
import com.osapps.capitalslearnproject.infrastructure.LocalRepository
import com.osapps.capitalslearnproject.main.presentation.MainPresenter

import javax.inject.Inject

import dagger.android.support.DaggerAppCompatActivity

class MainActivity : DaggerAppCompatActivity(), MainView {

    @Inject
    lateinit var mainPresenter: MainPresenter

    @Inject
    lateinit var localRepository: LocalRepository

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainPresenter.loadMain()
        println(localRepository)
        findViewById<View>(R.id.button).setOnClickListener { startActivity(Intent(this@MainActivity, FragmentActivity::class.java)) }
    }

    override fun onMainLoaded() {
        Log.v("TEST", "Main page is loaded.")
    }
}
