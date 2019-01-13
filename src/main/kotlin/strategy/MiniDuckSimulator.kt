package strategy

fun main(args: Array<String>) {
    val mallard = MallardDuck()
    mallard.performQuack()
    mallard.quackBehavior = Squeak()
    mallard.performQuack()
    mallard.performFly()
}