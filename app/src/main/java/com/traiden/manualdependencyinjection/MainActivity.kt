package com.traiden.manualdependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.traiden.manualdependencyinjection.di.carBuild.Car
import com.traiden.manualdependencyinjection.di.carBuild.Engine
import com.traiden.manualdependencyinjection.di.dagger.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    // Example of Field Injections..///

    @Inject
    lateinit var userRegistration: UserRegistration

    @Inject
    lateinit var emailService: EmailService

    @Inject
    lateinit var userRepo: UserRepo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val component = DaggerUserRegistrationComponent.builder().build()
        component.inject(this)
        userRegistration.registerUser("test@gmail.com","123")

//        val appComponent = DaggerAppComponent.builder().build()
//        val engine = appComponent.getEngineObject()
//        val car = Car(engine)
//        Log.d(MainActivity::class.simpleName, "onCreate: ${car.startCar()}")



    }
}