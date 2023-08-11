package com.traiden.manualdependencyinjection.di.dagger

import android.util.Log
import javax.inject.Inject

class SQLRepository @Inject constructor() :UserRepository{
    override fun saveUser(email:String, password:String){
        Log.d(SQLRepository::class.simpleName, "saveUser: Saving User in Database..")
    }
}