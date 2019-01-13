package strategy

abstract class Duck {
    abstract var flyBehaviour: FlyBehaviour
    abstract var quackBehavior: QuackBehaviour

    abstract fun display()

    fun performFly() {
        flyBehaviour.fly()
    }

    fun performQuack() {
        quackBehavior.quack()
    }

    fun swim() {
        println("All ducks float, even decoys!")
    }
}