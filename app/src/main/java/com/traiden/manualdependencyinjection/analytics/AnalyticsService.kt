package com.traiden.manualdependencyinjection.analytics

interface AnalyticsService {
    fun trackEvent(eventName:String,eventType:String)
}