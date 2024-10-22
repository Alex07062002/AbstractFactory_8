package Factory

import Bed.Bed
import Bed.ChaletBed
import Pedestal.ChaletPedestal
import Pedestal.Pedestal
import Wardrobe.ChaletWardrobe
import Wardrobe.Wardrobe

class ChaletBedroomFactory(val style: String = "chalet") : BedroomFactory {
    override fun createPedestal(): Pedestal {
        numberChaletPedestal += 1
        return ChaletPedestal(number = numberChaletPedestal)
    }

    override fun createBed(): Bed {
        numberChaletBed += 1
        return ChaletBed(number = numberChaletBed)
    }

    override fun createWardrobe(): Wardrobe {
        numberChaletWardrobe += 1
        return ChaletWardrobe(number = numberChaletWardrobe)
    }

    companion object{
        var numberChaletPedestal = 0L
        var numberChaletBed = 0L
        var numberChaletWardrobe = 0L
    }

}