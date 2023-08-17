package com.traiden.manualdependencyinjection.di.dagger.modules

import com.traiden.manualdependencyinjection.analytics.AnalyticsService
import com.traiden.manualdependencyinjection.analytics.FirebaseAnalytics
import com.traiden.manualdependencyinjection.analytics.Mixpanel
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton


@Module
class AnalyticsModule {


    @Named("mix")
    @Singleton
    @Provides
    fun getAnalyticsService():AnalyticsService{
        return Mixpanel()
    }

    @Named("firebase")
    @Singleton
    @Provides
    fun getFirebaseService():AnalyticsService{
        return FirebaseAnalytics()
    }
}