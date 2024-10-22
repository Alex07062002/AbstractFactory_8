import Bed.Bed
import Factory.BedroomFactory
import Pedestal.Pedestal
import Wardrobe.Wardrobe

class BuilderBedroom(bedroomFactory: BedroomFactory) {
    private val pedestal : Pedestal by lazy {bedroomFactory.createPedestal()}
    private val wardrobe : Wardrobe by lazy {bedroomFactory.createWardrobe()}
    private val bed : Bed by lazy {bedroomFactory.createBed()}
    private val bedroom : SetFurniture = SetFurniture(pedestal.style,bed,pedestal,wardrobe)

    fun getFurniture() : SetFurniture = bedroom

    override fun toString(): String {
        return "${pedestal}\n${wardrobe}\n${bed}\n" +
                "Bedroom in ${bed.style} was created!!!\n*----***----*"
    }
}