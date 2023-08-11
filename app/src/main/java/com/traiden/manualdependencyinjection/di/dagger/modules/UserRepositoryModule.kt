package com.traiden.manualdependencyinjection.di.dagger.modules

import com.traiden.manualdependencyinjection.di.dagger.FirebaseRepository
import com.traiden.manualdependencyinjection.di.dagger.SQLRepository
import com.traiden.manualdependencyinjection.di.dagger.UserRepository
import com.traiden.manualdependencyinjection.di.dagger.qualifier.FirebaseQualifier
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class UserRepositoryModule {


    @Named("sql")
    @Provides
    fun getSqlRepository(sqlRepository: SQLRepository): UserRepository {
        return sqlRepository
    }


    @FirebaseQualifier
    @Provides
    fun getFirebaseRepository(): UserRepository {
        return FirebaseRepository()
    }


//    @Binds
//    abstract fun getSqlRepository(sqlRepository: SQLRepository):UserRepository
}