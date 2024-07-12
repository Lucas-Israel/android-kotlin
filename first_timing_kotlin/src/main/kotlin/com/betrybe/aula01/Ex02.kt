package com.betrybe.aula01

// escreva um programa que calcule o salário de um funcionario, calcule e mostre o salário, sabendo
// que ele tem gratificação de 5% do salário base e paga 7% de imposto sobre o salário base

fun main() {
    print("Digite o salario: ")
    val salario: Double = readln().toDouble()

    println("O salario total é ${salario + gratificacao(salario) - imposto(salario)}")
}

fun gratificacao(salario: Double) = salario * 0.05

fun imposto(salario: Double) = salario * 0.07