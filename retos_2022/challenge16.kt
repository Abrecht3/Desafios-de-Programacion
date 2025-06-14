package com.albrecht3.retosdeprogramacion.retos_2022

/*
 * Reto #16
 * EN MAYÚSCULA
 * Fecha publicación enunciado: 18/04/22
 * Fecha publicación resolución: 25/04/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea una función que reciba un String de cualquier tipo y se encargue de
 * poner en mayúscula la primera letra de cada palabra.
 * - No se pueden utilizar operaciones del lenguaje que lo resuelvan directamente.
 *
 *
 */

fun main(){
    letraCapital("mi perro fiel")
    letraCapital("-siempre en desorden?")
    letraCapital("-one more chance?")
}

fun letraCapital(cadena: String){

    var aMayus = cadena

    println(cadena.replace("[^A-z]".toRegex()," ").split(" "))

    cadena.replace("[^A-z]".toRegex()," ").split(" ").forEach { word ->
        aMayus = aMayus.replace(word,word.replaceFirstChar { it.uppercase() })
    }
    println(aMayus)
}
