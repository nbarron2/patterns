package decorator

class Soy(private val beverage: Beverage): CondimentDecorator {
    override fun getDescription(): String {
        return beverage.getDescription() + " + soy"
    }

    override fun cost(): Float {
        return beverage.cost() + 10.0f
    }
}