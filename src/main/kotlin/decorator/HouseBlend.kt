package decorator

class HouseBlend: Beverage {
    override fun getDescription(): String {
        return "House blend"
    }

    override fun cost(): Float {
        return 1.25f
    }
}