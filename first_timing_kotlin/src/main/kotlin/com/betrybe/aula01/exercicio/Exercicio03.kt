package com.betrybe.aula01.exercicio

// Escrevas um programa em Kotlin que receba dois números e mostre o maior.
fun main() {
    print("Digite um número: ")
    val num1 = readln().toInt()

    print("Digite outro número: ")
    val num2 = readln().toInt()

    println("O numero ${higherNum(num1, num2)} é maior")
}

fun higherNum(a: Int, b: Int) = if (a > b) a else b