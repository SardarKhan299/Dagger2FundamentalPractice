package com.traiden.manualdependencyinjection.di.dagger

import android.util.Log
import com.traiden.manualdependencyinjection.di.app.AppScope
import javax.inject.Singleton

@AppScope
class MessageService(private val retryCount:Int):NotificationService {
    override fun send(to: String, from: String, body: String) {
        Log.d(MessageService::class.simpleName, "send: Message Sent Retyr Count is $retryCount")
    }
}