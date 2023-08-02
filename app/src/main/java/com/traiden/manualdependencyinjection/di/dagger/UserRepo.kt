package com.traiden.manualdependencyinjection.di.dagger

import android.util.Log
import javax.inject.Inject

class UserRepo @Inject constructor() {
    fun saveUser(email:String, password:String){
        Log.d(UserRepo::class.simpleName, "saveUser: Saving User in Database..")
    }
}