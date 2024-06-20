package com.betrybe.aula01

// Condicionais e condicionais multiplas

fun main() {
//    print("Digite sua idade: ")
//    val idade = readln().toInt()

//    if (idade > 18) {
//        println("Você é maior de idade")
//    } else {
//        println("Você é menor de idade")
//    }

//    val resultado = if (idade > 18) "Maior de idade" else "Menor de idade"
//
//    println(resultado)
    print("Qual dia é hoje? de 1 a 7: ")
    val diaDaSemana = readln().toInt()

    when (diaDaSemana) {
        1 -> println("Segunda")
        2 -> println("Terça")
        3 -> println("Quarta")
        4 -> println("Quinta")
        5 -> println("Sexta")
        6, 7 -> println("Fim de semana")
        else -> println("Dia invalido")
    }

}