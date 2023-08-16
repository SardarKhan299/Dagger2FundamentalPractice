package com.traiden.manualdependencyinjection.di.dagger.modules

import com.traiden.manualdependencyinjection.analytics.AnalyticsService
import com.traiden.manualdependencyinjection.analytics.Mixpanel
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class AnalyticsModule {

    @Singleton
    @Provides
    fun getAnalyticsService():AnalyticsService{
        return Mixpanel()
    }
}