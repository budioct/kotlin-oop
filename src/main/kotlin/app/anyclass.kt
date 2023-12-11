package app

import data.Laptop
import data.SmartPhone

fun main() {

    val smartPhone = SmartPhone("samsung", "android")
    println("name: ${smartPhone.name} os: ${smartPhone.os}")

    val laptop = Laptop("acer", "linux")
    println("name: ${laptop.name} os: ${laptop.os}")


}