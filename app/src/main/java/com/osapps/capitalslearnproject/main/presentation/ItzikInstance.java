package com.osapps.capitalslearnproject.main.presentation;

import javax.inject.Inject;

/**
 * Created by osapps on 17/04/2018.
 */
public class ItzikInstance {


    @Inject
    SubItzikInstance subItzikInstance;


    @Inject
    public ItzikInstance(SubItzikInstance subItzikInstance) {
        this.subItzikInstance = subItzikInstance;
    }

    public void talkItzik(){
        subItzikInstance.timeAfterTime();

    }


}
