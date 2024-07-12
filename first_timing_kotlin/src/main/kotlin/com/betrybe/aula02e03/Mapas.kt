package com.betrybe.aula02e03

fun main() {

    // mapOf() e mutableMapOf()
    val immutableMap = mapOf("banana" to "fruta", "bicicleta" to "veiculo")
    val mutableMap = mutableMapOf(1 to "numeros", 2 to "numeros", "agua" to "elemento")

    println(immutableMap)
    println(mutableMap)

    // adiciona no map
    mutableMap[1] = "numerado"

    // remove do map
    mutableMap.remove("agua")
    println(mutableMap)

    // iteração em um mapa

    for ((chave, valor) in immutableMap) {
        println("Essa é a chave: $chave, e esse é o valor: $valor")
    }
}