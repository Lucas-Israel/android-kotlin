package com.betrybe.aula02e03

fun main() {

    // Declarando array
    // arrayOf() cria um array com elementos especificados.
    val arr1 = arrayOf(1, 2, 3, 4, 5, 6)
    arrPrinter(arr1)

    val arr2 = arrayOf('a', 'b', 'c', 'd')
    arrPrinter(arr2)

    // Array() permite criar um array especificando o tamanho e uma função lambda (função anônima)
    // para inicializar os elementos
    val arr3 = Array(5) { i -> i * 2 }
    arrPrinter(arr3)

    // HOFS como arr3.forEach()
    arr3.forEach { num -> print(num) }
}

fun <T> arrPrinter(arr: Array<T>) {
    for (item in arr) {
        println(item)
    }
}