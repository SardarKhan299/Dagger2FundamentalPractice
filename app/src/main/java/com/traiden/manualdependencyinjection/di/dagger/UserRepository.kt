package com.traiden.manualdependencyinjection.di.dagger

import android.util.Log

interface UserRepository {
    fun saveUser(email:String, password:String)
}