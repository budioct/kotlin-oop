package data

class Boss(val name: String) {

    // keryword inner bisa mengakses attribute/field/properties di luar class innerChild
    inner class Employee(val name: String){

        fun hi(){
            println("Hi, my name is $name, and my boss is ${this@Boss.name}") // untuk akses attribute luar class dengan --> this@namaClass.namaAttribute
        }

    }

}