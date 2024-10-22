package Factory

import Bed.Bed
import Bed.ClassicismBed
import Pedestal.ClassicismPedestal
import Pedestal.Pedestal
import Wardrobe.ClassicismWardrobe
import Wardrobe.Wardrobe

class ClassicismBedroomFactory(val style : String = "classicism") : BedroomFactory {
    override fun createPedestal(): Pedestal {
        numberClassicismPedestal += 1
        return ClassicismPedestal(number = numberClassicismPedestal)
    }

    override fun createBed(): Bed {
        numberClassicismBed += 1
        return ClassicismBed(number = numberClassicismBed)
    }

    override fun createWardrobe(): Wardrobe {
        numberClassicismWardrobe += 1
        return ClassicismWardrobe(number = numberClassicismWardrobe)
    }

    companion object{
        var numberClassicismPedestal = 0L
        var numberClassicismBed = 0L
        var numberClassicismWardrobe = 0L
    }
}