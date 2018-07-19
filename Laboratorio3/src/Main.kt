import labo.*

fun c (lab: ArrayList<labo>) {
    lab.forEach { it.turnOn() }
}

fun main(args: Array<String>) {
    val menu = labo(
            lista = "lista"
    )
    val b: ArrayList<labo> = arrayListOf(
            menu
    )
    c(b)
    b.forEach { println(it) }

}
