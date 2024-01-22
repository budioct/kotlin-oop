package app

import data.Mahasiswa
import data.sayHello

fun main() {

    val budhi = Mahasiswa("budhi", "1111222233")
    budhi.sayHello("asep") // access method exstension

    val jamal: Mahasiswa? = Mahasiswa("jamal", "1111555544")
    jamal.sayHello("asep")

}