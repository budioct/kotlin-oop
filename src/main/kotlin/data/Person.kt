package data

class Person(
    firstName: String,
    middleName: String?,
    lastName: String
) {

    // block body class tidak sembarangan bisa digunakan, untuk itu jika ingin menjalankan program butuh.. saran jangan code terlalu berat
    // initializer block (akan jalan ketika constractor nya di panggil)
    init {
        println("Initializer Block")
        println("Person $firstName dibuat")
    }

    var firstName: String = firstName
    var middleName: String? = middleName
    var lastName: String = lastName
}