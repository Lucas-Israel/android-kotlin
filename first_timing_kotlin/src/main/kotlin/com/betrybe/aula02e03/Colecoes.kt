package com.betrybe.aula02e03

//Listas (List): Uma coleção ordenada de elementos que permite duplicatas.
//Conjuntos (Set): Uma coleção de elementos únicos e não ordenados.
//Mapas (Map): Uma coleção de pares chave-valor, onde cada chave mapeia para um valor correspondente

//Coleções Mutáveis: Permitem que você adicione, remova e modifique elementos após a criação.
// Por exemplo, mutableListOf cria uma lista mutável.
//
//Coleções Imutáveis: São somente leitura após a criação e não permitem modificações.
// Por exemplo, listOf cria uma lista imutável.
fun main() {

    //listOf() cria uma lista imutável
    val imutableList = listOf(1, 2, 3, 'a', 'b', 'c')
    listPrinter(imutableList)

    //mutableListOf() cria lista mutavel
    val mutableList = mutableListOf(4, 5, 'd', 'e')
    listPrinter(mutableList)
    mutableList[0] = 44
    listPrinter(mutableList)

    //adiciona na lista
    mutableList.add("banana")
    mutableList.remove('e')
    listPrinter(mutableList)

}

fun <T> listPrinter(list: List<T>) {
    for (item in list) {
        println(item)
    }
}