package Factory

import Bed.Bed
import Pedestal.Pedestal
import Wardrobe.Wardrobe

interface BedroomFactory{

    fun createPedestal() : Pedestal

    fun createBed() : Bed

    fun createWardrobe() : Wardrobe

}