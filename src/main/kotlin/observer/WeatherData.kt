package observer

class WeatherData: Subject {
    val observers: MutableList<Observer> = mutableListOf()
    private var temperature: Float = 0f
    private var humidity: Float = 0f
    private var pressure: Float = 0f

    override fun registerObserver(o: Observer) {
        observers.add(o)
    }

    override fun removeObserver(o: Observer) {
        observers.remove(o)
    }

    fun measurementsChanged() {
        notifyObservers()
    }

    override fun notifyObservers() {
        observers.forEach {
            it.update(
                    temp = temperature,
                    humidity = humidity,
                    pressure = pressure
            )
        }
    }
}