package data

class Address {

    var street: String = ""
    var city: String = ""
    var country: String = "Indonesia"

    // secodary constructor.. ini tidak punya mandatory constructor primary jadi tidak wajib memangil
    constructor(street: String, city: String) {
        this.street = street
        this.city = city
    }

    constructor(street: String, city: String, country: String) : this(street, city) {
        this.country = country
    }


}