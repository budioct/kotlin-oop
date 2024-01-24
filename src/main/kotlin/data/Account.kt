package data

import kotlin.properties.Delegates

class Account(description: String = "") {

    // kata kunci by adalah delegate kotlin
    // lazy {  } => lazy() return : Lazy<T>
    // jadi lazy di kotlin, akan di assaigment dan di eksekusi ketika di panggil
    val name: String by lazy {
        println("Name is called")
        "Budhi"
    } // lazy

    // observable properties .. // observaseri properti name... cek value sebelum di ubah dan setelah di ubah
    var description: String by Delegates.observable(description) { property, oldValue, newValue ->
        println("${property.name} is changed from $oldValue to $newValue")
    }

    val nameAs: String  = "Budhi" // eager // langsung di eksekusi
}