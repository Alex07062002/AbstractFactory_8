package Bed

import priceNeoclassicismBed

data class NeoclassicismBed(override val style: String = "neoclassicism",
                            override val number: Long,
                            override val price: Double = priceNeoclassicismBed) : Bed(){
    override fun toString(): String = "Bed in neoclassicism style was created!!!"
}
