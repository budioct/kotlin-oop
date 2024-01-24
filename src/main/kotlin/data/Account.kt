package data

class Account {

    // kata kunci by adalah delegate kotlin
    // lazy {  } => lazy() return : Lazy<T>
    // jadi lazy di kotlin, akan di assaigment dan di eksekusi ketika di panggil
    val name: String by lazy {
        println("Name is called")
        "Budhi"
    } // lazy

    val nameAs: String  = "Budhi" // eager // langsung di eksekusi
}