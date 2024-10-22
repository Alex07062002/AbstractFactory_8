package Pedestal

import priceChaletPedestal

data class ChaletPedestal(override val style: String = "chalet",
                          override val number: Long,
                          override val price: Double = priceChaletPedestal
): Pedestal(){
    override fun toString(): String = "Pedestal in chalet style was created!!!"
                     }


