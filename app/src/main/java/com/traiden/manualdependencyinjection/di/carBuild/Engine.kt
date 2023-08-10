package com.traiden.manualdependencyinjection.di.carBuild

import android.util.Log
import javax.inject.Inject

class Engine @Inject constructor() {
    fun start() {
        Log.d(Engine::class.simpleName, "start: ")
    }

}