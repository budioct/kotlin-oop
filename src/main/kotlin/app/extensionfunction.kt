package app

import data.Mahasiswa
import data.lowerName
import data.sayHello
import data.upperName

fun main() {

    val budhi = Mahasiswa("budhi", "1111222233")
    budhi.sayHello("asep") // access method exstension

    val jamal: Mahasiswa? = Mahasiswa("jamal", "1111555544")
    jamal.sayHello("asep")

    println("uppercase : ${budhi.upperName}")
    println("uppercase : ${jamal?.upperName}")

    println("lowercase : ${budhi.lowerName}")
    println("lowercase : ${jamal?.lowerName}")
}