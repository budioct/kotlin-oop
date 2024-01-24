package app

import exception.ValidationException

fun main() {

    /**
     * // jika null.. maka akan error exception runtime
     * Exception in thread "main" exception.ValidationException: Name is Blank
     * 	at app.ExceptionKt.validationAndSayHello(exception.kt:13)
     * 	at app.ExceptionKt.main(exception.kt:7)
     * 	at app.ExceptionKt.main(exception.kt)
     */

    // validationAndSayHello("budhi")
    // validationAndSayHello("") // Error exception runtime

    // dengan try catch
    try {

        validationAndSayHello("budhi")
        validationAndSayHello("") // Error exception runtime
    } catch (e: ValidationException) {
        println("Error on ${e.message}")
    } catch (e: Throwable) {
        println("Error on ${e.message}")
    } finally {
        println("Program Selesai")
    }

}

fun validationAndSayHello(name: String) {
    if (name.isBlank()) {
        throw ValidationException("Name is Blank")
    } else {
        println("Hello $name")
    }
}