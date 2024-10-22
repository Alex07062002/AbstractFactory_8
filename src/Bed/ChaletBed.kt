package Bed

import priceChaletBed

data class ChaletBed(override val style: String = "chalet",
                     override val number: Long,
                     override val price: Double = priceChaletBed
): Bed(){
    override fun toString(): String = "Bed in chalet style was created!!!"
                     }


