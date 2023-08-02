package com.traiden.manualdependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.traiden.manualdependencyinjection.di.dagger.DaggerUserRegistrationComponent
import com.traiden.manualdependencyinjection.di.dagger.EmailService
import com.traiden.manualdependencyinjection.di.dagger.UserRegistration
import com.traiden.manualdependencyinjection.di.dagger.UserRegistrationComponent
import com.traiden.manualdependencyinjection.di.dagger.UserRepo

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val component = DaggerUserRegistrationComponent.builder().build()
//        val userRepo = UserRepo()
//        val emailService = EmailService()
//        val userRegistration = UserRegistration(userRepo,emailService)
        component.getUserRegistrationService().registerUser("test@gmail.com","123")

    }
}