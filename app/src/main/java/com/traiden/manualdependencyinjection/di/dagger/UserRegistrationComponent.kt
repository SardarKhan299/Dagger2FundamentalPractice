package com.traiden.manualdependencyinjection.di.dagger

import com.traiden.manualdependencyinjection.MainActivity
import com.traiden.manualdependencyinjection.di.dagger.modules.NotificationServiceModule
import com.traiden.manualdependencyinjection.di.dagger.modules.UserRepositoryModule
import dagger.Component

@Component(modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {
   fun inject(mainActivity: MainActivity)
}