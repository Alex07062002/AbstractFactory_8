package Factory

import Bed.Bed
import Bed.NeoclassicismBed
import Pedestal.NeoclassicismPedestal
import Pedestal.Pedestal
import Wardrobe.NeoclassicismWardrobe
import Wardrobe.Wardrobe

class NeoclassicismBedroomFactory(val style : String = "neoclassicism") : BedroomFactory {
    override fun createPedestal(): Pedestal {
        numberNeoclassicismPedestal += 1
        return NeoclassicismPedestal(number = numberNeoclassicismPedestal)
    }

    override fun createBed(): Bed {
        numberNeoclassicismBed += 1
        return NeoclassicismBed(number = numberNeoclassicismBed)
    }

    override fun createWardrobe(): Wardrobe {
        numberNeoclassicismWardrobe += 1
        return NeoclassicismWardrobe(number = numberNeoclassicismWardrobe)
    }

    companion object{
        var numberNeoclassicismPedestal = 0L
        var numberNeoclassicismBed = 0L
        var numberNeoclassicismWardrobe = 0L
    }
}
