package com.traiden.manualdependencyinjection.di.dagger

import android.util.Log

class FirebaseRepository : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d(FirebaseRepository::class.simpleName, "saveUser: In Firebase")
    }
}