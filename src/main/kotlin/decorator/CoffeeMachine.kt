package decorator

class CoffeeMachine {
    lateinit var coffee: Beverage

    fun darkRoast(): CoffeeMachine {
        coffee = DarkRoast()
        return this
    }

    fun houseBlend(): CoffeeMachine {
        coffee = HouseBlend()
        return this
    }

    fun withSoy(): CoffeeMachine {
        coffee = Soy(coffee)
        return this
    }

    fun withMilk(): CoffeeMachine {
        coffee = Milk(coffee)
        return this
    }

    fun pour(): Beverage {
        return coffee
    }
}