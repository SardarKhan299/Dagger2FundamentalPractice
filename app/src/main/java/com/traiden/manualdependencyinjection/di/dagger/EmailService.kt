package com.traiden.manualdependencyinjection.di.dagger

import android.util.Log
import javax.inject.Inject

class EmailService @Inject constructor(){
    fun send(to:String, from:String,body:String){
        Log.d(EmailService::class.simpleName, "send: Sending Email to User...")
    }
}