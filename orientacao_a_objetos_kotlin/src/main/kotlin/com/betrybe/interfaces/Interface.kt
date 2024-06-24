package com.betrybe.interfaces

// declaração de ‘interface’ e propriedade
interface MyInterface {
    val prop: Int // abstrato

    val propriedadeComImplementacao: String
        get() = "foo"

    fun bar()
    fun foo() {
        // corpo opcional
    }
}

// implementando interface
class Child : MyInterface {
    override val prop: Int = 20

    override fun bar() {
        // corpo
    }
}