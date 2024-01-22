package data

abstract class Animal {

    // abstract do not initialize
    // abstract body cannot be set assaigment

    abstract val name: String
    abstract fun run()
}

class Cat : Animal() {

    override val name: String = "Cat"

    override fun run() {
        println("Car run")
    }

}

class Dog: Animal(){

    override val name: String = "Dog"

    override fun run() {
        println("Dog run")
    }
}