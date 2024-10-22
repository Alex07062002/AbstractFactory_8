package Bed

import priceEclecticismBed

data class EclecticismBed(override val style: String = "eclecticism",
                          override val number: Long,
                          override val price: Double = priceEclecticismBed) : Bed(){
    override fun toString(): String = "Bed in eclecticism style was created!!!"
                          }
