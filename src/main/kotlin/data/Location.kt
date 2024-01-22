package data

abstract class Location(val name: String) {
} // abstract default open, for contract inheritance

class City(name: String) : Location(name){

}

class Country(name: String) : Location(name){

}