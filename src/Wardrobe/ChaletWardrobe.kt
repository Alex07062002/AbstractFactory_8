package Wardrobe

import priceChaletWardrobe

data class ChaletWardrobe(override val style: String = "chalet",
                          override val number: Long,
                          override val price: Double = priceChaletWardrobe
): Wardrobe(){
    override fun toString(): String = "Wardrobe in chalet style was created!!!"
                     }


