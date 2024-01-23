package app

import data.Application
//import data.Utilities

fun main() {

    val budhi = Application.Utilities.toUpper("budhi") // singleton menjadi inner object.. access dari outerClass.InnerClass.method()/properties
    println(budhi)
    println(Application.Utilities.name)
}