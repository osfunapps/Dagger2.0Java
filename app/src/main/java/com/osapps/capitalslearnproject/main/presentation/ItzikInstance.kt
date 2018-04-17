package com.osapps.capitalslearnproject.main.presentation

import javax.inject.Inject

/**
 * Created by osapps on 17/04/2018.
 */
class ItzikInstance @Inject constructor(var subItzikInstance: SubItzikInstance) {

    fun talkItzik() {
        subItzikInstance.timeAfterTime()

    }


}
