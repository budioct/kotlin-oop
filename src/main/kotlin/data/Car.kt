package data

class Car(paramBrand: String, paramName: String, paramYear: Int) {

    //var brand: String = ""
    //var year: Int = 2023

    //initializer block mirip seperti block static java akan di jalankan sekali ketika object dipanggil
    // jangan terlalu berat menggunakan block init{}
    init {
        println("Initializer: Car $paramBrand di buat")
    }

    // secondary constructor wajib memangil primary constructor.. // this memangil constructor primary(pertama)
    constructor(paramBrand: String, paramName: String) : this(paramBrand, paramName, 2020){
        println("Secondary Constructor")
    }

    constructor(paramBrand: String) : this(paramBrand, ""){
        println("Thrird Constructor")
    }

    var brand: String = paramBrand // set param constructor to field, attribute, propertry
    var name: String = paramName
    var year: Int = paramYear //

}