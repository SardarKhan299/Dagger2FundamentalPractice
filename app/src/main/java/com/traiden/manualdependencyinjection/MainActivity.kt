package com.traiden.manualdependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.traiden.manualdependencyinjection.di.dagger.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    // Example of Field Injections..///

    @Inject
    lateinit var userRegistration: UserRegistration

    @Inject
    lateinit var userRepository: UserRepository

    @Inject
    lateinit var notificationService: NotificationService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerUserRegistrationComponent.builder().build()
        component.inject(this)
        userRegistration.registerUser("test@gmail.com","123")

    }
}