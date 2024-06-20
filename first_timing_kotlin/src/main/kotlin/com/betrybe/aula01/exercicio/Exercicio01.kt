package com.betrybe.aula01.exercicio

//Escreva um programa usando Kotlin que receba o salário de uma pessoa colaboradora, calcule e
// mostre o novo salário, sabendo-se que este sofreu um aumento de 25%
fun main() {
    print("Digite o salário do colaborador: ")
    val salario = readln().toDouble()

    print("Seu novo salário é de: ${salario * 1.25}")
}