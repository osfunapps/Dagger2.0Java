package com.osapps.capitalslearnproject.main.presentation

import com.osapps.capitalslearnproject.infrastructure.LocalRepository
import javax.inject.Inject

/**
 * Created by osapps on 17/04/2018.
 */
class ItzikInstance @Inject constructor(var subItzikInstance: SubItzikInstance) {

    @Inject lateinit var localRepository: LocalRepository

    fun talkItzik() {
        subItzikInstance.timeAfterTime()
    }


}
