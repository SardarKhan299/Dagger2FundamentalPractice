package com.traiden.manualdependencyinjection.di.dagger

import android.util.Log
import com.traiden.manualdependencyinjection.di.app.AppScope
import javax.inject.Inject
import javax.inject.Singleton


class EmailService @Inject constructor():NotificationService{
    override fun send(to:String, from:String, body:String){
        Log.d(EmailService::class.simpleName, "send: Sending Email to User...")
    }
}