package com.betrybe.tipo_object

object Config {
    val Idioma = "PT-BR"
    val Tema = "Escuro"
}

// Objetos podem implementar interfaces.

interface Auditable {
    fun auditar()
}

object Auditoria : Auditable {
    override fun auditar() {
        println("Auditar evento...")
    }
}

fun main() {
    println(Config.Idioma)
    println(Config.Tema)
    println(Auditoria.auditar())
}