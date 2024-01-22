package data

class Television() {

    // lateinit adalah kemampuan supaya bisa bikin attribute tidak mau initilized di awal (mirip di java bisa null saat deklarasi attribute)

    lateinit var brand: String // keyword lateinit supaya attribute tidak langsung initialize sesuai kaida cara kerja kotlin

    fun initBrand(value: String){
        this.brand = value
    }

}