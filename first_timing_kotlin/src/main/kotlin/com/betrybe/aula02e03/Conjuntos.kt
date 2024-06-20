package com.betrybe.aula02e03

fun main() {
    // setOf() e mutableSetOf()
    val immutableSet = setOf(1, 1, 2, 3)
    val mutableSet = mutableSetOf(4, 5, 5, 6)

    println(immutableSet)
    println(mutableSet)

    mutableSet.add(7)

    println(mutableSet)

    mutableSet.remove(4)
    println(mutableSet)

    // acessando
    val temUm = 1 in immutableSet
    val temCem = 100 in mutableSet
    println(temUm)
    println(temCem)

    // iterando em um set
    for (num in immutableSet) {
        println("que numero é esse? $num")
    }
}