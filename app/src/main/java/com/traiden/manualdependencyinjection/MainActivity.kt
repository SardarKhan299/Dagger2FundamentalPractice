package com.traiden.manualdependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.traiden.manualdependencyinjection.di.dagger.DaggerUserRegistrationComponent
import com.traiden.manualdependencyinjection.di.dagger.EmailService
import com.traiden.manualdependencyinjection.di.dagger.UserRegistration
import com.traiden.manualdependencyinjection.di.dagger.UserRegistrationComponent
import com.traiden.manualdependencyinjection.di.dagger.UserRepo
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistration: UserRegistration

    @Inject
    lateinit var emailService: EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val component = DaggerUserRegistrationComponent.builder().build()
        component.inject(this)
//        val userRepo = UserRepo()
//        val emailService = EmailService()
//        val userRegistration = UserRegistration(userRepo,emailService)
//        val emailService = component.getEmailService()
        userRegistration.registerUser("test@gmail.com","123")

    }
}