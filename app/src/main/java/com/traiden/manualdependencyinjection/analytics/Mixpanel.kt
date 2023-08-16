package com.traiden.manualdependencyinjection.analytics

import android.util.Log

class Mixpanel:AnalyticsService {
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d(Mixpanel::class.simpleName, "trackEvent: Mixpanel.")
    }
}