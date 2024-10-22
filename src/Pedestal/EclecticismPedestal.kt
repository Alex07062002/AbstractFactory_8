package Pedestal

import priceEclecticismPedestal

data class EclecticismPedestal(override val style: String = "eclecticism",
                               override val number: Long,
                               override val price: Double = priceEclecticismPedestal) : Pedestal(){
    override fun toString(): String = "Pedestal in eclecticism style was created!!!"
                          }
