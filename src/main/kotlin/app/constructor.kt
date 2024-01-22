package app

import data.Car

fun main(){

    val fortuner = Car("fortuner", "4x4")
    println("${fortuner.brand} ${fortuner.name} ${fortuner.year}")

    val avanza = Car("avanza")
    println("${avanza.brand} ${avanza.name} ${avanza.year}")

}