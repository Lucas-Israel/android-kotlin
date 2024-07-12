package com.betrybe.modificadores_de_acesso

// em pacotes

private fun foo() {  } // visível dentro de exemplo.kt

public var bar: Int = 5 // propriedade é visível de qualquer lugar
    private set         // setter ´s visível apenas em exemplo.kt

internal val baz = 6    // visível dentro do mesmo módulo


// em membros da mesma classe

// private significa que o membro é visível apenas dentro desta classe (incluindo todos os seus membros).
//
// protected significa que o membro tem a mesma visibilidade que um membro marcado como privado, mas que também é visível em subclasses.
//
// internal significa que qualquer cliente dentro deste módulo que veja a classe declarante vê os seus membros internos.
//
// public significa que qualquer cliente que veja a classe declarante vê os seus membros públicos.
//
// Se substituir um membro protected ou internal e não especificar explicitamente a visibilidade, o membro substituído terá também a mesma visibilidade que o original.

// exemplo:

open class Outer {
    private val a = 1
    protected open val b = 2
    internal open val c = 3
    val d = 4  // public by default

    protected class Nested {
        public val e: Int = 5
    }
}

class Subclass : Outer() {
    // a is not visible
    // b, c and d are visible
    // Nested and e are visible

    override val b = 5   // 'b' is protected
    override val c = 7   // 'c' is internal
}

class Unrelated(o: Outer) {
    // o.a, o.b are not visible
    // o.c and o.d are visible (same module)
    // Outer.Nested is not visible, and Nested::e is not visible either
}