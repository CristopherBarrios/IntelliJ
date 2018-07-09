package main.utils




class Radio (
        private val emisora: Double,
        private val color: String,
        var isTurnedOn: Boolean = false,
        private val volumen: Int
) {
    fun turnOn() {
        isTurnedOn = true
    }

    fun turnOff() {
        isTurnedOn = false
    }

    override fun toString(): String {
        return """
            Car:
                Model: $emisora
                Color: $color
                Doors: $volumen
                Is turned On: $isTurnedOn
        """.trimIndent()
    }
}
