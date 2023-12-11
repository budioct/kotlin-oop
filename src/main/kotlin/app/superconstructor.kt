package app

import data.Customer
import data.ExecutiveCustomer
import data.PremiumCustomer

fun main() {

    val customer = Customer("husein", "Premium")
    println("customer name: ${customer.name} type: ${customer.type}")


    val premiumCustomer = PremiumCustomer("budhi")
    println("premiumCustomer name: ${premiumCustomer.name} ")

    val executiveCustomer = ExecutiveCustomer("adam", 100_000_000L)
    println("executiveCustomer name: ${executiveCustomer.name} balance: ${executiveCustomer.balance}")

}