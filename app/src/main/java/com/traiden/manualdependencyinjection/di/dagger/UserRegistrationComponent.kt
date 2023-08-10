package com.traiden.manualdependencyinjection.di.dagger

import com.traiden.manualdependencyinjection.MainActivity
import com.traiden.manualdependencyinjection.di.carBuild.Car
import com.traiden.manualdependencyinjection.di.carBuild.Engine
import dagger.Component

@Component
interface UserRegistrationComponent {
   fun inject(mainActivity: MainActivity)
}