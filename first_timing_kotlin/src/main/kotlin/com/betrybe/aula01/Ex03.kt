package com.betrybe.aula01

import kotlin.math.pow

// calculadora de IMC, altura em metros, peso em kilos, altura / peso ^ 2

fun main() {
    print("Digite seu peso em kilos: ")
    val kg: Double = readln().toDouble()

    print("Digite sua altura em metros: ")
    val altura: Double = readln().toDouble()

    println("Seu IMC é igual a: ${calcImc(kg, altura)}")
}

fun calcImc(kg: Double, altura: Double) = kg / altura.pow(2.0)