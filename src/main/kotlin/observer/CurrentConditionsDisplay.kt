package observer

class CurrentConditionsDisplay(weatherData: Subject): Observer, DisplayElement {
    var temperature: Float = 0.0f
    var humidity: Float = 0.0f

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        this.temperature = temp
        this.humidity = humidity
        display()
    }

    override fun display() {
        println("Current conditions: ${temperature}F degrees and ${humidity}% humidity")
    }

    init {
        weatherData.registerObserver(this)
    }
}
