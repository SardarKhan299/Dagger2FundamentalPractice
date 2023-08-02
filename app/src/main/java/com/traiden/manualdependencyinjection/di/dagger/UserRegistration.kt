package com.traiden.manualdependencyinjection.di.dagger


// unit Test...///
// Single Responsibility...//
// Life Time of Objects..//
// Extensible..//
// constructor injection...//
class UserRegistration(private val userRepo: UserRepo, private val emailService: EmailService) {

//    private val userRepo=UserRepo()
//    private val emailService = EmailService()

    fun registerUser(email:String, password:String){
        userRepo.saveUser(email,password)
        emailService.send(email,"test@gmail.com","Hello")
    }
}