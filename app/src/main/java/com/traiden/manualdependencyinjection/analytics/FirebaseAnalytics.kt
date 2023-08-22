package com.traiden.manualdependencyinjection.analytics

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FirebaseAnalytics @Inject constructor():AnalyticsService {
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d(FirebaseAnalytics::class.simpleName, "trackEvent: Firebase.")
    }
}