package com.traiden.manualdependencyinjection.di.dagger

interface NotificationService {
    fun send(to:String,from:String,body:String)
}