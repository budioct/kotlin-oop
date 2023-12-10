package app

import data.Person

fun main() {

    val budhi = Person("budhi", null, "oct"); // instance
//    budhi.firstName = "budhi"
//    budhi.lastName = "oct"

    val adam = Person("adam", null, "husin");
//    adam.firstName = "adam"
//    adam.lastName = "husein"

    val jamal = Person("jamal")
    val husein = Person("husein", "barokah")

    println("${budhi.firstName} ${budhi.lastName}")
    println("${adam.firstName} ${adam.lastName}")
    println("${husein.firstName} ${husein.lastName}")
    println("${jamal.firstName} ")
}