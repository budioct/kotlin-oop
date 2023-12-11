package data

class Person(
    firstName: String,
    middleName: String?,
    lastName: String?
) {

    // block body class tidak sembarangan bisa digunakan, untuk itu jika ingin menjalankan program butuh.. saran jangan code terlalu berat
    // initializer block (akan jalan ketika constractor nya di panggil)
    init {
        //println("Initializer Block")
        println("Person $firstName dibuat")
    }

    // secondary constructor
    constructor(firstName: String, lastName: String?) : this(firstName, null, lastName) {
        println("secondary constructor 1")
    }

    constructor(firstName: String) : this(firstName, null) {
        println("secondary constructor 2")
    }

    var firstName: String = firstName
    var middleName: String? = middleName
    var lastName: String? = lastName

    fun sayHello(name: String) {
        println("Hello $name, My name is $firstName")
    }

    fun run() {
        println("I 'm Run")
    }

    fun getFullName(): String {
        return "fullName Is $firstName $middleName $lastName"
    }


}