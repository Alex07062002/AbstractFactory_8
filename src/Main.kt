import Factory.*

/**
 * На мебельной фабрике производят комплекты для спальни,
 * каждый из которых состоит из кровати, шкафа и тумбочки,
 * в четырех разных стилях: Классицизм, Неоклассицизм,
 * Эклектика и Шале. Использовав паттерн проектирования
 * «Абстрактная фабрика», реализовать программный продукт,
 * демонстрирующий произведенный на фабрике комплект мебели
 * в каждом из перечисленных стилях.
 */
    fun main() {
        val counter = 15
        val market : MutableList<SetFurniture> = mutableListOf() // All bedroom for sale -> market
        val alex = Client("Alex", 5000.0, mutableListOf())
        for (i in 0..counter) {
            val bedroom = newApp(arrayOf("chalet","classicism","eclecticism","neoclassicism").random())
            market.add(bedroom)
        }
   // alex.buyFurniture(market[(0..<market.size).random()])
    }

fun newApp(style : String) : SetFurniture{
    val factory : BedroomFactory =
        when(style){
            "chalet" -> ChaletBedroomFactory()
            "classicism" -> ClassicismBedroomFactory()
            "eclecticism" -> EclecticismBedroomFactory()
            "neoclassicism" -> NeoclassicismBedroomFactory()
            else -> throw IllegalArgumentException("Factory is not built your style bedroom!")
    }
    println(BuilderBedroom(factory).toString())
    return BuilderBedroom(factory).getFurniture()
}

