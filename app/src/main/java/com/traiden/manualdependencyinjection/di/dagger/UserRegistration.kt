package com.traiden.manualdependencyinjection.di.dagger

import javax.inject.Inject


// unit Test...///
// Single Responsibility...//
// Life Time of Objects..//
// Extensible..//
// constructor injection...//
class UserRegistration @Inject constructor(private val userRepo: UserRepository, private val notificationService: NotificationService) {

    fun registerUser(email:String, password:String){
        userRepo.saveUser(email,password)
        notificationService.send(email,"test@gmail.com","Hello")
    }
}