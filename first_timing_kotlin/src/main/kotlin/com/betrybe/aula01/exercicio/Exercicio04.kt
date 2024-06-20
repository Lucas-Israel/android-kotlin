package com.betrybe.aula01.exercicio

// Escreva um programa em Kotlin que receba três notas de uma pessoa estudante e mostre a média
// aritmética e a mensagem de acordo com as regras a seguir:
//
//Média aritmética igual ou maior que 0.0 e menor do que 3.0, exibir a mensagem REPROVADO
//Média aritmética igual ou maior que 3.0 e menor do que 7.0, exibir a mensagem EXAME
//Média aritmética igual ou maior que 7.0 e menor do que 10.0, exibir a mensagem APROVADO

fun main() {
    print("Primeira nota do estudante: ")
    val nota1 = readln().toInt()

    print("Segunda nota do estudante: ")
    val nota2 = readln().toInt()

    print("Terceira nota do estudante: ")
    val nota3 = readln().toInt()

    val media = ( nota1 + nota2 + nota3 ) / 3

    if (media in 0..3) {
        println("REPROVADO")
    }
    if (media in 4..7) {
        println("EXAME")
    }
    if (media > 7){
        println("APROVADO")
    }
}