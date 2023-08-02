package com.traiden.manualdependencyinjection.di.dagger

class UserRegistration {
    private val userRepo=UserRepo()
    private val emailService = EmailService()

    fun registerUser(email:String, password:String){
        userRepo.saveUser(email,password)
        emailService.send(email,"test@gmail.com","Hello")
    }
}