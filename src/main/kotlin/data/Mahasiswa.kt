package data

class Mahasiswa(val name: String, val nim: String)

// attribute / field / properties extension
val Mahasiswa.upperName : String
    get() = this.name.toUpperCase()

val Mahasiswa.lowerName : String
    get() = this.name.toLowerCase()

// method extension
fun Mahasiswa?.sayHello(name: String) {
    // able null with keyword ? condition
    if (this != null) {
        println("Hello $name, my name is ${this.name}, and my nim is ${this.nim}")
    }
}
