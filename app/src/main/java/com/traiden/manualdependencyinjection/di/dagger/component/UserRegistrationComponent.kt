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

//   @Subcomponent.Factory
//   interface Factory {
//      fun create(@BindsInstance retryCount:Int) :UserRegistrationComponent
//   }

   // Steps for Builder..
   // Annotate it with Component.Builder or Subcomponent.Builder.
   // Define Build Method which return Component..
   // parameter or runtime values we required for that we need to define methods for it that return builder.

   @Subcomponent.Builder
   interface Builder {
      fun build():UserRegistrationComponent
      fun retryCount(@BindsInstance retryCount: Int):Builder
   }
}