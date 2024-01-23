package data

class Application(val name: String) {

    // singleton object
    object Utilities {

        // keyword object digunakan untuk membuat singleton.. singleton tidak bisa dibuatkan constructor karna tidak ada class
        // singleton bisa dibuat di dalam class. tetapi tidak sama seperti inner class. singleton tidak bisa access properties atau function yang ada di outer class

        val name = "Utilities"
        fun toUpper(value: String): String {
            return value.toUpperCase()
        }

    }

    // companion object
    companion object {

        // Companion object adalah kemampuan membuat inner object di dalam class, tanpa harus menggunakan nama object
        // Companion object secara otomatis akan menggunakan nama Companion, atau bisa langsung diakses lewat nama class nya

        fun hello(name: String): Unit {
            println("Hello dear $name")
        }
    }

}
