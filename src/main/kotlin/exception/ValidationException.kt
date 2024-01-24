package exception

// untuk bikin Exception harus inheritance Throwable
class ValidationException(message: String) : Throwable(message) {
}