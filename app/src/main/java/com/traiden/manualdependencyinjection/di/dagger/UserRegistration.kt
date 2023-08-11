package com.traiden.manualdependencyinjection.di.dagger

import com.traiden.manualdependencyinjection.di.dagger.qualifier.FirebaseQualifier
import com.traiden.manualdependencyinjection.di.dagger.qualifier.MessageQualifier
import javax.inject.Inject
import javax.inject.Named


// unit Test...///
// Single Responsibility...//
// Life Time of Objects..//
// Extensible..//
// constructor injection...//
class UserRegistration @Inject constructor(
    @FirebaseQualifier private val userRepo: UserRepository,
    @MessageQualifier private val notificationService: NotificationService
    ) {

    fun registerUser(email:String, password:String){
        userRepo.saveUser(email,password)
        notificationService.send(email,"test@gmail.com","Hello")
    }
}