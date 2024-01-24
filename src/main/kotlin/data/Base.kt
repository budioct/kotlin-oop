package data

interface Base {

    /**
     * Delegation
     * ● Salah satu design pattern lain yang populer adalah Delegation
     * ● Delegation sederhananya adalah meneruskan properties atau function ke object yang lain
     * ● Kotlin mendukung delegation tanpa harus membuat kode secara manual
     */
    fun sayHello(name: String)
    fun sayGoodBay(name: String)
}

// implement
class MyBase : Base {
    override fun sayHello(name: String) {
        println("Hello from MyBase $name")
    }

    override fun sayGoodBay(name: String) {
        println("GoodBay from MyBase $name")
    }

}

// Delegation Manual
class DelegateManual(val base: Base) : Base {
    override fun sayHello(name: String) {
        base.sayHello(name)
    }
    override fun sayGoodBay(name: String) {
        base.sayGoodBay(name)
    }

}

// Deletation native. tidak perlu lagi implement method override ke body class Delegate
class Delegate(val base: Base) : Base by base


/**
 * Override Delegation
 * ● Dalam delegation, properties dan function secara otomatis akan didelegasikan ke object yang dipilih
 * ● Namun kita tetap bisa meng-override properties dan function jika kita mau
 */
// override Deletation
class DelegateOverride(val base: Base) : Base by base {
    override fun sayHello(name: String) {
        println("Hello from OverrideDelegate $name")
    }

    override fun sayGoodBay(name: String) {
        println("GoodBay from OverrideDelegate $name")
    }
}