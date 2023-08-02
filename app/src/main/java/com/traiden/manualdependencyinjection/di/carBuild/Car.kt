package com.traiden.manualdependencyinjection.di.carBuild

class Car {

    // At that moment our Car class has some problems.
    // it cannot be unit test separatly.//

    private var engine:Engine = Engine()

    fun startCar(){
        engine.start()
    }

}