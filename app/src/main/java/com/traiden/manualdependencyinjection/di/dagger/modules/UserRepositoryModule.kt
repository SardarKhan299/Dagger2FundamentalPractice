package com.traiden.manualdependencyinjection.di.dagger.modules

import com.traiden.manualdependencyinjection.di.dagger.FirebaseRepository
import com.traiden.manualdependencyinjection.di.dagger.SQLRepository
import com.traiden.manualdependencyinjection.di.dagger.UserRepository
import com.traiden.manualdependencyinjection.di.dagger.qualifier.FirebaseQualifier
import com.traiden.manualdependencyinjection.di.scope.ActivityScope
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class UserRepositoryModule {


    @ActivityScope
    @Named("sql")
    @Provides
    fun getSqlRepository(sqlRepository: SQLRepository): UserRepository {
        return sqlRepository
    }


    @ActivityScope
    @FirebaseQualifier
    @Provides
    fun getFirebaseRepository(firebaseRepository: FirebaseRepository): UserRepository {
        return firebaseRepository
    }


//    @Binds
//    abstract fun getSqlRepository(sqlRepository: SQLRepository):UserRepository
}