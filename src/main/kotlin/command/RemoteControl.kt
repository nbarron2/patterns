package command

class RemoteControl {
    lateinit var slot: Command

    fun setCommand(command: Command) {
        slot = command
    }

    fun buttonwWasPressed() {
        slot.execute()
    }
}