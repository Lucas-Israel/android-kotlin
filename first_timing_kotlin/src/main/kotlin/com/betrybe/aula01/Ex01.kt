package com.betrybe.aula01

//escrever um programa que retorne média entre 3 numeros

fun main() {
    print("Digite o primeiro número: ")
    val num1: Int = readln().toInt()

    print("Digite o segundo número: ")
    val num2: Int = readln().toInt()

    print("Digite o terceiro número: ")
    val num3: Int = readln().toInt()

    println("O valor é ${calcularMedia(num1, num2, num3)}")
}

//fun calcularMedia(num1:Int, num2:Int, num3:Int ):Int {
//    return (num1 + num2 + num3) / 3
//}

fun calcularMedia(num1: Int, num2: Int, num3: Int) = (num1 + num2 + num3) / 3