package app

import data.Address

fun main() {
    val address1 = Address("jalan maju mundur", "jakarta")
    val address2 = Address("jalan maju tak gentar", "jakarta", "Indonesia")

    println(address1.street)
    println(address2.street)
}