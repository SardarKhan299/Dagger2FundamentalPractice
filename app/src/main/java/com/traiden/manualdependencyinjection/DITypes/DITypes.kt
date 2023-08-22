package com.traiden.manualdependencyinjection.DITypes

class DITypes {

    // 1. Implementation Inheritance
    // 2. Composition
    // 3. Aggregation
    // 4. Interface Inheritance

    // 1. Implementation Inheritance... IS-A relation ship..//
    // Student is a Person. Change in peron class allow change in Student class as well.
    // Person is a generalization or abstraction of Student instead.
    open class Person(val name: String) {
        fun think() {
            println("$name is thinking...")
        }
        fun eat() {
            println("$name is eating...")
        }
    }
    class Student(name: String) : Person(name) {
        fun study(topic: String) {
            println("$name is studying $topic")
        }
    }

    // After we need some changes...//
    abstract class Person1(val name: String) {
        fun think() {
            println("$name is thinking...")
        }
    }

    // Abstraction is synonymous with reduction.
    // we can use Interface for Abstraction..//



    // 2. Composition..//
    // Composition over (implementation) inheritance

    data class Data(val value: Int)
    class Repository {
        fun save(data: Data) {
        // Save data
        }
    }
    class Server {
        private val repository = Repository()
        fun receive(data: Data) {
            repository.save(data)
        }
    }

    // 3. Aggregation..//

    class Server1(val repository: Repository) {
        fun receive(data: Data) {
            repository.save(data)
        }
    }

    // 4. Interface Inheritance..//
    // Its also dependency Inversion..//

    interface Repository1 {
        fun save(data: Data)
    }
    class RepositoryImpl : Repository1 {
        override fun save(data: Data) {
        // Save data
        }
    }




}