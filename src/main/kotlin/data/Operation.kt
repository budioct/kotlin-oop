package data

// keyword sealed akan menjadi class abstract, sangat berguna ketika menggunakan when expression (conditional)
sealed class Operation(val name : String)

class Plus : Operation("Plus")
class Minus : Operation("Minus")
class Modulo : Operation("Module")