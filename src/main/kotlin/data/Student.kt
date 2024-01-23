package data

data class Student(val name: String, val score: Int) {
}

/**
 * Type Alias
 * ● Kotlin mendukung Type Alias
 * ● Type Alias adalah membuat nama berbeda dari tipe data yang telah ada
 * ● Biasanya ini digunakan ketika ada tipe data dengan nama yang sama, atau untuk mempersingkat tipe data sehingga kita tidak perlu menulisnya terlalu panjang
 */
// typealias class
typealias Pelajar = Student
typealias Murid = Pelajar

// typealias method
typealias StringSupplier = () -> String

fun sayHello(supplier: StringSupplier){
    println("Hello bro ${supplier()}")
}
