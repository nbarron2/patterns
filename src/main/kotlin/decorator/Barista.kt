package decorator

fun main(args: Array<String>) {
    val machine = CoffeeMachine()

    val houseWithMilk = machine.houseBlend().withMilk().pour()
    println("One ${houseWithMilk.getDescription()} for ${houseWithMilk.cost()}")

    val darkRoastWithEverything = machine.darkRoast().withMilk().withSoy().pour()
    println("One ${darkRoastWithEverything.getDescription()} for ${darkRoastWithEverything.cost()}")
}