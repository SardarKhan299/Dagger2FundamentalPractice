package com.traiden.manualdependencyinjection.di.clientService

// Constructor Injection..//
class Client (private val service1: Service1){

    private lateinit var service2 : Service2
    // property or field injection..///
    // we can set this from outside the app using global variable..//
    lateinit var service3: Service3

    // method injection..//
    fun setService2(service2: Service2){
        this.service2 = service2
    }

}