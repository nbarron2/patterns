package decorator

class Milk(private val beverage: Beverage): CondimentDecorator {
    override fun getDescription(): String {
        return beverage.getDescription() + " + milk"
    }

    override fun cost(): Float {
        return beverage.cost() + 0.25f
    }
}