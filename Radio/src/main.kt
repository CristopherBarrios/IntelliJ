package main

import main.utils.*

fun enciendelosTodos (Rad: ArrayList<Radio>) {
    Rad.forEach { it.turnOn() }
}
fun apagalosTodos (Rad: ArrayList<Radio>){
    Rad.forEach { it.turnOff()}
}
fun cambiaemisora (Rad: ArrayList<Radio>){
    Rad.forEach{ it.turnfm()}
}
fun cambiaemisoraam (Rad: ArrayList<Radio>){
    Rad.forEach{ it.turnam()}
}


fun main(args: Array<String>) {
    val sony = Radio(
            color = "negro",
            volumen = 9
    )

    val samsung = Radio(
            color = "blanco",
            volumen = 8
    )

    val misRadios: ArrayList<Radio> = arrayListOf(
            sony,
            samsung
    )
    enciendelosTodos(misRadios)
    misRadios.forEach { println(it) }
    apagalosTodos(misRadios)
    misRadios.forEach { println(it) }
    
    cambiaemisora(misRadios)
    misRadios.forEach { println(it) }
    cambiaemisoraam(misRadios)
    misRadios.forEach { println(it) }
}