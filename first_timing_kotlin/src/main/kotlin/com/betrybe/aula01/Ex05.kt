package com.betrybe.aula01

// Estruturas de repetição

fun main() {

    // for loop
    for (i in 1..5){
        println("Indice $i")
    }

    // while loop
    var numCond = 1

    while (numCond < 6) {
        println("while: $numCond")
        // numCond += 1
        numCond ++
    }

    // do while loop
    var entrada: String
    do {
        print("Digite sair para encerrar: ")
        entrada = readlnOrNull() ?: ""
    } while (entrada != "sair")

    // O break interrompe imediatamente o laço de repetição, enquanto o continue pula a iteração
    // atual e continua com a próxima.
}