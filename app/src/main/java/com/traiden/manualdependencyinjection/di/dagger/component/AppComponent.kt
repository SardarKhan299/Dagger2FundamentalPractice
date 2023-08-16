package com.traiden.manualdependencyinjection.di.dagger.component

import com.traiden.manualdependencyinjection.analytics.AnalyticsService
import com.traiden.manualdependencyinjection.analytics.Mixpanel
import com.traiden.manualdependencyinjection.di.dagger.modules.AnalyticsModule
import dagger.Component
import dagger.Provides
import javax.inject.Singleton

@Singleton
@Component(modules = [AnalyticsModule::class])
interface AppComponent {
    //fun getAnalyticsService():AnalyticsService
    // subcomponent
    fun getUserRegistrationComponentBuilder():UserRegistrationComponent.Builder
}