package com.traiden.manualdependencyinjection.di.dagger

import android.util.Log
import com.traiden.manualdependencyinjection.di.app.AppScope

@AppScope
class FirebaseRepository : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d(FirebaseRepository::class.simpleName, "saveUser: In Firebase")
    }
}