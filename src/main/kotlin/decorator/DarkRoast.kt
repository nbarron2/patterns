package decorator

class DarkRoast: Beverage {
    override fun getDescription(): String {
        return "dark roast"
    }

    override fun cost(): Float {
        return 1.00f
    }

}