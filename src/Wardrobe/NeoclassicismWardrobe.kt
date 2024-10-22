package Wardrobe

import priceNeoclassicismWardrobe

data class NeoclassicismWardrobe(override val style: String = "neoclassicism",
                                 override val number: Long,
                                 override val price: Double = priceNeoclassicismWardrobe) : Wardrobe(){
    override fun toString(): String = "Wardrobe in neoclassicism style was created!!!"
}
