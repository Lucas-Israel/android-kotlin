package com.betrybe.classes

// definindo classe

class Classes {
}

// definindo classe vazia
class Empty

// construtor
class ClasseComConstrutor constructor(arg1: String, arg2: Number) {

}

// Se o construtor primário não tiver quaisquer anotações ou modificadores de visibilidade,
// a palavra-chave constructor pode ser omitida:
class ConstrutorOmitido(arg1: String) {
}

// teste da ordem de iniciamento
class InitOrderDemo(name: String) {
    val firstProperty = "First property: $name".also(::println)

    init {
        println("First initializer block that prints $name")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }
}

// construtor inline
class Person(val firstName: String, val lastName: String, var age: Int)

// classe abstrata
abstract class Polygon {
    abstract fun draw()
}

class Rectangle : Polygon() {
    override fun draw() {
        // draw the rectangle
    }
}

fun main() {
    InitOrderDemo("hello")
}