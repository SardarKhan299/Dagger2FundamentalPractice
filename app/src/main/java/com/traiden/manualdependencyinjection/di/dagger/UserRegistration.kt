package com.traiden.manualdependencyinjection.di.dagger

import javax.inject.Inject


// unit Test...///
// Single Responsibility...//
// Life Time of Objects..//
// Extensible..//
// constructor injection...//
class UserRegistration @Inject constructor(private val userRepo: UserRepo, private val emailService: EmailService) {

//    private val userRepo=UserRepo()
//    private val emailService = EmailService()

    fun registerUser(email:String, password:String){
        userRepo.saveUser(email,password)
        emailService.send(email,"test@gmail.com","Hello")
    }
}