package Wardrobe


import priceEclecticismWardrobe

data class EclecticismWardrobe(override val style: String = "eclecticism",
                               override val number: Long,
                               override val price: Double = priceEclecticismWardrobe) : Wardrobe(){
    override fun toString(): String = "Wardrobe in eclecticism style was created!!!"
                          }
