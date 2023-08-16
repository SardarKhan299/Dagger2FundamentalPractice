package com.traiden.manualdependencyinjection.di.dagger.component

import com.traiden.manualdependencyinjection.MainActivity
import com.traiden.manualdependencyinjection.di.dagger.modules.AnalyticsModule
import com.traiden.manualdependencyinjection.di.dagger.modules.NotificationServiceModule
import com.traiden.manualdependencyinjection.di.dagger.modules.UserRepositoryModule
import com.traiden.manualdependencyinjection.di.scope.ActivityScope
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {
   fun inject(mainActivity: MainActivity)

   @Subcomponent.Factory
   interface Factory {
      fun create(@BindsInstance retryCount:Int) :UserRegistrationComponent
   }
}