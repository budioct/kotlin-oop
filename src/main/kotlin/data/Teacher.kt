package data

class Teacher {

    // hanya di class ini saja
    private fun teach() {
        println("I am teach")
    }

    // bisa di luar class dan directory
    public fun teachPublic() {
        println("I am teach")
    }

    // hanya bisa di class ini dan class turunan
    protected fun teachProtected() {
        println("I am teach")
    }

    // bisa di luar class dan directory
    internal fun teachInternal(){
        println("I am teach")
    }

}