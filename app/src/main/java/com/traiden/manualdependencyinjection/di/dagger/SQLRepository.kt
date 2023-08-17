package com.traiden.manualdependencyinjection.di.dagger

import android.util.Log
import com.traiden.manualdependencyinjection.analytics.AnalyticsService
import com.traiden.manualdependencyinjection.di.scope.ActivityScope
import javax.inject.Inject
import javax.inject.Named

@ActivityScope
class SQLRepository @Inject constructor(@Named("mix") val analyticsService: AnalyticsService) :UserRepository{
    override fun saveUser(email:String, password:String){
        Log.d(SQLRepository::class.simpleName, "saveUser: Saving User in Database..")
        analyticsService.trackEvent("save User","Create")
    }
}