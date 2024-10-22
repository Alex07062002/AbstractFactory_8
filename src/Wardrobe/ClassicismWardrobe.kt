package Wardrobe

import priceClassicismWardrobe

data class ClassicismWardrobe(override val style: String = "classicism",
                              override val number: Long,
                              override val price: Double = priceClassicismWardrobe) : Wardrobe(){
    override fun toString(): String = "Wardrobe in classicism style was created!!!"
}
