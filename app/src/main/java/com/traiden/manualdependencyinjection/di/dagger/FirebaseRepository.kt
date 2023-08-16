package com.traiden.manualdependencyinjection.di.dagger

import android.util.Log
import com.traiden.manualdependencyinjection.analytics.AnalyticsService
import com.traiden.manualdependencyinjection.di.scope.ActivityScope
import javax.inject.Inject

@ActivityScope
class FirebaseRepository @Inject constructor(val analyticsService: AnalyticsService) : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d(FirebaseRepository::class.simpleName, "saveUser: In FirebaseAnalytics")
        analyticsService.trackEvent("save user firebase","createUser")
    }
}