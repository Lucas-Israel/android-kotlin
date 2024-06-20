package com.betrybe.aula01.exercicio

// Cada degrau de uma escada tem X de altura. Escreva um programa usando Kotlin que receba essa
// altura e a altura que uma pessoa deseja alcançar usando a escada, calcule e mostre quantos
// degraus ela deverá subir para atingir seu objetivo, sem se preocupar com a altura da pessoa.
// Todas as medidas fornecidas devem estar em metros.

fun main() {

    print("Qual o tamanho de cada degrau em metros? ")
    val stepH = readln().toDouble()

    print("Qual altura deseja alcançar em metros? ")
    val targetH = readln().toDouble()

    print("Você tera que subir ${targetH / stepH} degraus para chegar ao topo")
}