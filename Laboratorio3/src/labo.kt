class labo(
        var encendido: Boolean = false,
        private val lista: String) {
    fun turnOn() {
        encendido = true
    }
    override fun toString():String{
        return """
            menu:
                1.Nombre de la lista
                2.Nombre de la lista
                3.Nombre de la lista
                4.Salir
        """.trimIndent()
    }
}


