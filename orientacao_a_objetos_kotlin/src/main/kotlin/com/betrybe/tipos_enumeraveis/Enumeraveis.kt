package com.betrybe.tipos_enumeraveis

// Os tipos enumeráveis, ou simplesmente Enums, são uma ferramenta poderosa em Kotlin para
// representar conjuntos fixos de valores nomeados. Eles oferecem uma maneira eficiente e nítida de
// definir constantes específicas e limitadas em seu código.

enum class Direction {
    NORTH, SOUTH, WEST, EAST
}


//Como cada enum é uma instância da classe enum, ele pode ser inicializado como:
enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

enum class RGB { RED, GREEN, BLUE }

// O método valueOf() lança uma exceção do tipo IllegalArgumentException se o nome especificado não
// corresponder a nenhuma das constantes de enum definidas na classe.

// Em Kotlin 1.9.0, a propriedade entries é introduzida como um substituto para a função values().
// A propriedade entries devolve uma lista imutável pré-alocada das suas constantes enum. Isto é
// particularmente útil quando se está a trabalhar com coleções e pode ajudar a evitar problemas de desempenho.

fun main() {
    for (color in RGB.values()) println(color.toString()) // imprime RED, GREEN, BLUE
    println("A primeira cor é: ${RGB.valueOf("RED")}") // imprime "A primeira cor é: RED"

    println(RGB.RED.name) // imprime RED
    println(RGB.RED.ordinal) // imprime 0
}