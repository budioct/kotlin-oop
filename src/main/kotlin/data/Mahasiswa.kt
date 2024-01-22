package data

class Mahasiswa(val name: String, val nim: String)

// method extension
fun Mahasiswa?.sayHello(name: String) {
    // able null with keyword ? condition
    if (this != null) {
        println("Hello $name, my name is ${this.name}, and my nim is ${this.nim}")
    }
}
