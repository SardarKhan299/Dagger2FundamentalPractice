package com.traiden.manualdependencyinjection.di.dagger


interface UserRepository {
    fun saveUser(email:String, password:String)
}