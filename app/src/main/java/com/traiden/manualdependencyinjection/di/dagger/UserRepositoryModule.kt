package com.traiden.manualdependencyinjection.di.dagger

import dagger.Module
import dagger.Provides

@Module
class UserRepositoryModule {

    @Provides
    fun getFirebaseRepository():UserRepository{
        return FirebaseRepository()
    }

//    @Provides
//    fun getSqlRepository():UserRepository{
//        return SQLRepository()
//    }
}