package main

import main.utils.*

fun enciendelosTodos (carros: ArrayList<Radio>) {
    carros.forEach { it.turnOn() }
}
fun apagalosTodos (carros: ArrayList<Radio>){
    carros.forEach { it.turnOff()}
}


fun main(args: Array<String>) {
    val sony = Radio(
            emisora = 90.1,
            color = "negro",
            volumen = 9
    )

    val samsung = Radio(
            emisora = 80.4,
            color = "blanco",
            volumen = 4
    )

    val misRadios: ArrayList<Radio> = arrayListOf(
            sony,
            samsung
    )
    enciendelosTodos(misRadios)
    misRadios.forEach { println(it) }
}