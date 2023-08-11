package com.traiden.manualdependencyinjection.di.dagger

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class UserRepositoryModule {

//    @Provides
//    fun getFirebaseRepository():UserRepository{
//        return FirebaseRepository()
//    }

    @Binds
    abstract fun getSqlRepository(sqlRepository: SQLRepository):UserRepository
}