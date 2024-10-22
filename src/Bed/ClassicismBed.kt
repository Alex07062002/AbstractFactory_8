package Bed

import priceClassicismBed

data class ClassicismBed(override val style: String = "classicism",
                         override val number: Long,
                         override val price: Double = priceClassicismBed) : Bed(){
    override fun toString(): String = "Bed in classicism style was created!!!"
}
