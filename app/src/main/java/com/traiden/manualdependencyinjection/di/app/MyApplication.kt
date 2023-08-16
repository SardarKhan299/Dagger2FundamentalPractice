package com.traiden.manualdependencyinjection.di.app

import android.app.Application
import android.util.Log
import com.traiden.manualdependencyinjection.di.dagger.component.AppComponent
import com.traiden.manualdependencyinjection.di.dagger.component.DaggerAppComponent

class MyApplication :Application() {

    lateinit var appComponent: AppComponent


    override fun onCreate() {
        super.onCreate()
        Log.d(MyApplication::class.simpleName, "onCreate: ")
       appComponent = DaggerAppComponent.builder().build()
    }
}