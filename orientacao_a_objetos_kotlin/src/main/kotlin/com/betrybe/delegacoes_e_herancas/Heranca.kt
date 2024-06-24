package com.betrybe.delegacoes_e_herancas

class Example // Implicitamente herda de Any

// Any tem três métodos: equals(), hashCode() e toString().
// Assim, estes métodos são definidos para todas as classes Kotlin.
// Por padrão, as classes Kotlin são finais - não podem ser herdadas.
// Para tornar uma classe herdável, marque-a com a palavra-chave open

open class Base(p: Int) // Classe está aberta para herança

class Derived(p: Int) : Base(p)

// Kotlin requer modificadores explícitos para membros substituíveis e substituições

open class Shape {
    open fun draw() {
        println("draw")
    }

    fun fill() {
        println("fill de shape")
    }
}

class Circle() : Shape() {
    override fun draw() {
        println("draw de circle")
    }
}

// O código de uma classe derivada pode chamar as funções da sua superclasse e suas respectivas
// propriedades utilizando a palavra-chave super

open class Rectangle {
    open fun draw() { println("Drawing a rectangle") }
    val borderColor: String get() = "black"
}

class FilledRectangle : Rectangle() {
    override fun draw() {
        super.draw()
        println("Filling the rectangle")
    }

    val fillColor: String get() = super.borderColor
}

fun main() {
    val shape: Shape = Shape()
    val circle: Circle = Circle()
    val rectanglee: Rectangle = FilledRectangle()

//    println(shape.draw())
//    println(shape.fill())
//    println(circle.draw())
//    println(circle.fill())
    println(rectanglee.draw())
}