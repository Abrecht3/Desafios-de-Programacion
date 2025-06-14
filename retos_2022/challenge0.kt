package com.albrecht3.retosdeprogramacion.retos_2022

/*
 * Reto #0
 * EL FAMOSO "FIZZ BUZZ"
 * Fecha publicación enunciado: 27/12/21
 * Fecha publicación resolución: 03/01/22
 * Dificultad: FÁCIL
 * Enunciado: Escribe un programa que muestre por consola (con un print) los números de 1 a 100 (ambos incluidos y con un salto de línea entre cada impresión),
 * sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 * - La función retorna el número de veces que se ha impreso el número en lugar de los textos.
 *
 *
 */

fun main(){
    var contador = fizzBuzz()
    println("$contador veces que se mostro un numero")
}

private fun fizzBuzz(): Int {
    var count:Int = 0

    for (it in 1.. 100){
        if (it % 3 == 0 && it % 5 == 0){
            println("fizzbuzz")
        }else if (it % 3 == 0){
            println("fizz")
        }else if (it % 5 == 0){
            println("buzz")
        } else{
            println(it)
            count+=1
        }

    }
    return count
}