package data

class Laptop(val name: String, val os: String) // => class Laptop : Any()

class SmartPhone(val name: String, val os: String) // => class SmartPhone : Any()

/**
 * Any Class
 * ● Di Kotlin, semua class yang kita buat tanpa class Parent, sebenarnya secara otomatis dia akan menjadi class child dari class Any
 * ● Any adalah superclass untuk semua class yang kita buat di Kotlin
 *
 * public open class Any ---> adalah super class/object dari setiap object yang di buat kan inherited. kalau di java super class Object
 */