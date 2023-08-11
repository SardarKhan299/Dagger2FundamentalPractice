package com.traiden.manualdependencyinjection.di.dagger

import com.traiden.manualdependencyinjection.MainActivity
import com.traiden.manualdependencyinjection.di.carBuild.Car
import com.traiden.manualdependencyinjection.di.carBuild.Engine
import dagger.Component

@Component(modules = [UserRepositoryModule::class,NotificationServiceModule::class])
interface UserRegistrationComponent {
   fun inject(mainActivity: MainActivity)
}