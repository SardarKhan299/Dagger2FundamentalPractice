package com.traiden.manualdependencyinjection.di.carBuild

// constructor injection..//
class Car(private val engine1:Engine) {

    // At that moment our Car class has some problems.
    // it cannot be unit test properly.//
    // code is not extensible..// because our class is dependent on this engine. we cannot add more engines.
    // Voilates Single Responsibility.
    // LifeTime of objects. Engine class object lifetime is dependent on car.//
    // what if we need to replace the engine. When our car object is destroyed then our engine object is destroyed..//
    // we cannot reuse this engine Object. we cannot use that engine object in another class..//
    // system will provide the dependencies..our class will not create the dependencies...//


    private var engine:Engine = Engine()

    fun startCar(){
        engine.start()
        engine1.start()
    }

}