package annotation

@Target(AnnotationTarget.CLASS) // target annotation ini adalah class
@Retention(AnnotationRetention.RUNTIME) // bisa di baca oleh Feflection (kemampuan mengambil seluruh detail object) // akan Error Exception Runtime
@MustBeDocumented // ketika annotation ini di buat saat di compile akan di generate documentation
annotation class Fancy(val author: String)
//{
//val name: String = "budhi" // Members are not allowed in annotation class // tidak boleh memiliki attribute di annotation
//}
