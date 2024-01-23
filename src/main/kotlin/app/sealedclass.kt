package app

import data.Minus
import data.Modulo
import data.Operation
import data.Plus

fun main() {

    println(opertaion(10, 10, Plus()))
    println(opertaion(100, 10, Minus()))
    println(opertaion(10, 9, Modulo()))

}

fun opertaion(value1: Int, value2: Int, operation: Operation): Int {
    return when (operation) {
        is Plus -> value1 + value2 // is // pengecekan type data
        is Minus -> value1 - value2
        is Modulo -> value1 % value2

    }
}