package com.traiden.manualdependencyinjection.di.app

import android.app.Application
import android.util.Log
import com.traiden.manualdependencyinjection.analytics.FirebaseAnalytics
import com.traiden.manualdependencyinjection.analytics.Mixpanel
import com.traiden.manualdependencyinjection.di.dagger.component.AppComponent
import com.traiden.manualdependencyinjection.di.dagger.component.DaggerAppComponent
import javax.inject.Inject

class MyApplication :Application() {

    lateinit var appComponent: AppComponent


    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder().build()
        appComponent.inject(this)

        Log.d(MyApplication::class.simpleName, "onCreate: ")
    }
}