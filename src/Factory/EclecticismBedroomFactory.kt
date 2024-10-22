package Factory

import Bed.Bed
import Bed.EclecticismBed
import Pedestal.EclecticismPedestal
import Pedestal.Pedestal
import Wardrobe.EclecticismWardrobe
import Wardrobe.Wardrobe

class EclecticismBedroomFactory(val style : String = "eclecticism") : BedroomFactory {
    override fun createPedestal(): Pedestal {
        numberEclecticismPedestal += 1
        return EclecticismPedestal(number = numberEclecticismPedestal)
    }

    override fun createBed(): Bed {
        numberEclecticismBed += 1
        return EclecticismBed(number = numberEclecticismBed)
    }

    override fun createWardrobe(): Wardrobe {
        numberEclecticismWardrobe += 1
        return EclecticismWardrobe(number = numberEclecticismWardrobe)
    }

    companion object{
        var numberEclecticismPedestal = 0L
        var numberEclecticismBed = 0L
        var numberEclecticismWardrobe = 0L
    }
}
