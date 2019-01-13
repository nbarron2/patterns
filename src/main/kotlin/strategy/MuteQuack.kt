package strategy

class MuteQuack: QuackBehaviour {
    override fun quack() {
        println("<<Silence>>")
    }
}