package com.traiden.manualdependencyinjection.di.dagger

import dagger.Component

@Component
interface UserRegistrationComponent {

   fun  getUserRegistrationService():UserRegistration

}