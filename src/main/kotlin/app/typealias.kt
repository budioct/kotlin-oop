package app

import data.Murid
import data.Pelajar
import data.sayHello

fun main() {

    // typealias class
    val pelajar = Pelajar("budhi", 78)
    val murid = Murid("asep", 82)

    println(pelajar)
    println(murid)

    // typealias method
    sayHello { "budhi" }
    sayHello { "jamal" }



}