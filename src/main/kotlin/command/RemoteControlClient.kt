package command

fun main(args: Array<String>) {
    val remote = RemoteControl()
    val lightOnCommand = LightOnCommand(Light())

    remote.setCommand(lightOnCommand)

    remote.buttonwWasPressed() //this can be triggered some other way
}