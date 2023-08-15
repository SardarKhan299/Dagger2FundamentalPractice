package com.traiden.manualdependencyinjection.di.dagger

import android.util.Log
import com.traiden.manualdependencyinjection.di.app.AppScope
import javax.inject.Inject
import javax.inject.Singleton

@AppScope
class SQLRepository @Inject constructor() :UserRepository{
    override fun saveUser(email:String, password:String){
        Log.d(SQLRepository::class.simpleName, "saveUser: Saving User in Database..")
    }
}