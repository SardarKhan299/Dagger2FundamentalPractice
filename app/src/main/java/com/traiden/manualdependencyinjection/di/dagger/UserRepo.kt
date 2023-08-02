package com.traiden.manualdependencyinjection.di.dagger

import android.util.Log

class UserRepo {
    fun saveUser(email:String, password:String){
        Log.d(UserRepo::class.simpleName, "saveUser: Saving User in Database..")
    }
}