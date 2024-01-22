package app

import data.City
import data.Country
import data.Location

fun main() {

    //val location = Location("asek") // Error: Cannot create an instance of an abstract class, because abstract class for contract inheritance
    val country = Country("Indonesia")
    val city = City("Tangerang")

    println("Country ${country.name}")
    println("City ${city.name}")

}