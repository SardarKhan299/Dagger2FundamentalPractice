package com.traiden.manualdependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.traiden.manualdependencyinjection.di.dagger.*
import com.traiden.manualdependencyinjection.di.dagger.component.DaggerUserRegistrationComponent
import com.traiden.manualdependencyinjection.di.dagger.modules.NotificationServiceModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    // Example of Field Injections..///

    @Inject
    lateinit var userRegistration: UserRegistration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val component = DaggerUserRegistrationComponent.factory().create(3)
        component.inject(this)
        userRegistration.registerUser("test@gmail.com","123")
    }
}