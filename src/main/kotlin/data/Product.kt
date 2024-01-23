package data

// keyword data, mirip di java library lombok untuk helper generate class POJO, Entity.. otomatis akan dibuatkan= equals(), hashcode(), toString(), copy()
data class Product(
    val name: String,
    val price: Int,
    val category: String
)