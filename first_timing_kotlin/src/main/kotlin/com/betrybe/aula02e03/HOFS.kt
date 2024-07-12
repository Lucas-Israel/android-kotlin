package com.betrybe.aula02e03

fun main() {

    // Retornando funções de outras funções
    // Neste exemplo, a função multiplicaPor retorna uma função que multiplica um número pelo valor
    // fornecido.
    val triplica = multiplicaPor(3)
    val resultado = triplica(5)
    println(triplica)
    println(resultado)

    // HOFS para listas
    // em alguns casos é necessario usar a palavra reservada it.
    // .map {}
    val numeros = listOf(1, 2, 3, 4)
    println(numeros.map { it * it })

    // .filter {}
    println(numeros.filter { it % 2 == 0 })

    // .reduce {}
    println(numeros.reduce { acc, num -> acc + num })

    // .forEach {}
    numeros.forEach { item -> println(item) }

    // .all {} Verifica se todos os elementos da lista atendem a um critério específico.
    println(numeros.all { it % 2 == 0 })
}

fun multiplicaPor(a: Int) = { numero: Int -> numero * a }
