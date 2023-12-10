package app

import data.Person

fun main() {

    val budhi = Person(); // instance
    budhi.firstName = "budhi"
    budhi.lastName = "oct"

    val adam = Person();
    adam.firstName = "adam"
    adam.lastName = "husein"

    println("${budhi.firstName} ${budhi.lastName}")
    println("${adam.firstName} ${adam.lastName}")
}