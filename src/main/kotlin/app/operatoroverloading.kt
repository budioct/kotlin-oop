package app

import data.Fruit

fun main() {

    val fruit1 = Fruit(100)
    val fruit2 = Fruit(100)
    val resultMethod = fruit1.plus(fruit2) // 100 + 100 = 200
    val resultOperator = fruit1 + fruit2 // 100 + 100 = 200.. with method overloading opertator
    println(resultMethod) // 200
    println(resultOperator) // 200

}