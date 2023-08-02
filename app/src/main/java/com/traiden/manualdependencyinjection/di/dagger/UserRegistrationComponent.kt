package com.traiden.manualdependencyinjection.di.dagger

import com.traiden.manualdependencyinjection.MainActivity
import dagger.Component

@Component
interface UserRegistrationComponent {

//   fun  getUserRegistrationService():UserRegistration
//   fun getEmailService():EmailService

   fun inject(mainActivity: MainActivity)

}