package Pedestal

import priceNeoclassicismPedestal

data class NeoclassicismPedestal(override val style: String = "neoclassicism",
                                 override val number: Long,
                                 override val price: Double = priceNeoclassicismPedestal) : Pedestal(){
    override fun toString(): String = "Pedestal in neoclassicism style was created!!!"
}
