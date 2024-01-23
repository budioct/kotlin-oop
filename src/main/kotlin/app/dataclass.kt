package app

import data.Product

fun main() {

    val sotoBogor = Product("Soto Bogor", 13000, "Food")
    val sotoBogor2 = sotoBogor.copy(name = "bakso urat") // copy() kemampuan bikin object dari object laing, object yang di copy menjadi prototype

    println(sotoBogor) // Product(name=Soto Bogor, price=13000, category=Food)
    println(sotoBogor2) // Product(name=Soto Bogor, price=13000, category=Food)

}