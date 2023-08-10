package com.traiden.manualdependencyinjection.di.carBuild

import com.traiden.manualdependencyinjection.di.carBuild.Engine
import dagger.Component

@Component
interface AppComponent {
    fun getEngineObject(): Engine
}