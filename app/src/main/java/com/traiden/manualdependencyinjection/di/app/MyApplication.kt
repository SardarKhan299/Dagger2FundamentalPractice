package com.traiden.manualdependencyinjection.di.app

import android.app.Application
import android.util.Log
import com.traiden.manualdependencyinjection.di.dagger.component.DaggerUserRegistrationComponent
import com.traiden.manualdependencyinjection.di.dagger.component.UserRegistrationComponent

class MyApplication :Application() {

    lateinit var userRegistrationComponent:UserRegistrationComponent

    override fun onCreate() {
        super.onCreate()
        Log.d(MyApplication::class.simpleName, "onCreate: ")
        userRegistrationComponent = DaggerUserRegistrationComponent.factory().create(3)
    }
}