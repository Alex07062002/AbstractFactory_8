data class Client(val name : String, var wallet : Double,
                  val furnitures : MutableList<SetFurniture>) : ClientStrategy {
    override fun buyFurniture(furniture: SetFurniture) {
        when {
                wallet in 0.0..<furniture.price -> {
                throw IllegalArgumentException("Your money is not right for sold this furniture")
            }
                else ->{
                    wallet -= furniture.price
                    this.furnitures.add(furniture)
                }
        }
    }

    override fun soldFurniture(furniture: SetFurniture) {
        this.wallet += furniture.price
        furnitures.remove(furniture)
    }

}