package strategy

class FlyNoWay: FlyBehaviour {
    override fun fly() {
        println("I can't fly")
    }
}
