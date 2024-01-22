package app

import data.Cat
import data.Dog

fun main() {

    val cat = Cat()
    println(cat.name)
    cat.run()

    val dog = Dog()
    println(dog.name)
    dog.run()

}