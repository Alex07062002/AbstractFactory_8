import Bed.Bed
import Pedestal.Pedestal
import Wardrobe.Wardrobe

data class SetFurniture(
    var name : String, val style: String, val bed : Bed, val pedestal: Pedestal,
    val wardrobe: Wardrobe, val price : Double){
    constructor(name: String, bed : Bed, pedestal: Pedestal, wardrobe: Wardrobe) :
            this(name,style = if (bed.style == pedestal.style && pedestal.style == wardrobe.style)
                bed.style else throw StyleConflictException("Collection isn't one style!"),
                bed,pedestal, wardrobe, bed.price + pedestal.price + wardrobe.price)

}
