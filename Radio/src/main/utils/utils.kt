package main.utils

class Radio (
        var emisora: Boolean = false,
        private val color: String,
        var encendido: Boolean = false,
        private val volumen: Int,
        private val tamano: String,
        private val anio: String,
        private val bocinas: Int
)
{
    fun turnOn() {
        encendido = true
    }

    fun turnOff() {
        encendido = false
    }
    fun turnfm(){
        emisora = true
    }
    fun turnam(){
        emisora = false
    }

    override fun toString(): String {
        return """
            Radio:
                Emisora: $emisora
                Color: $color
                encendido: $encendido
                volumen: $volumen
                tamanio: $tamano
                anio: $anio
                bocinas: $bocinas
        """.trimIndent()
    }
}
