package Pedestal

import priceClassicismPedestal

data class ClassicismPedestal(override val style: String = "classicism",
                              override val number: Long,
                              override val price: Double = priceClassicismPedestal) : Pedestal(){
    override fun toString(): String = "Pedestal in classicism style was created!!!"
}
