package com.traiden.manualdependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.traiden.manualdependencyinjection.di.app.MyApplication
import com.traiden.manualdependencyinjection.di.dagger.*
import com.traiden.manualdependencyinjection.di.dagger.component.UserRegistrationComponent
import com.traiden.manualdependencyinjection.di.dagger.modules.NotificationServiceModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    // Example of Field Injections..///

    @Inject
    lateinit var userRegistration: UserRegistration

    @Inject
    lateinit var emailService: EmailService

    @Inject
    lateinit var emailService1: EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val appComponent = (application as MyApplication).appComponent
        val userRegistrationComponent = appComponent.getUserRegistrationComponentFactory().create(3)
        userRegistrationComponent.inject(this)
        userRegistration.registerUser("test@gmail.com","123")
    }
}