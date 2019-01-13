package strategy

class MallardDuck() : Duck() {
    override var flyBehaviour: FlyBehaviour = FlyWithWings()
    override var quackBehavior: QuackBehaviour = Quack()

    override fun display() {
        println("I'm a real mallard duck")
    }
}