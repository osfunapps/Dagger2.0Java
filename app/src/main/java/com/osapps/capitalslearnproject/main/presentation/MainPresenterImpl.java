package com.osapps.capitalslearnproject.main.presentation;

import com.osapps.capitalslearnproject.main.view.MainView;

import javax.inject.Inject;


public class MainPresenterImpl implements MainPresenter{

    MainView mainView;
    ItzikInstance instance;

    @Inject
    public MainPresenterImpl(MainView mainView, ItzikInstance instance) {
        this.mainView = mainView;
        this.instance = instance;
    }

    public void loadMain(){
        System.out.println("is itzik null? " + instance == null );
        mainView.onMainLoaded();
        instance.subItzikInstance.timeAfterTime();
    }
}