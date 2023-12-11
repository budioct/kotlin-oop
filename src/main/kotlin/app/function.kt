package app

import data.Person

fun main() {

    val budhi = Person("budhi", "oct", "404")

    budhi.sayHello("Jamal")
    budhi.run()
    println(budhi.getFullName())

    val fullName = budhi.getFullName()
    println(fullName)


}