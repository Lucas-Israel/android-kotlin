package com.betrybe.delegacoes_e_herancas
import kotlin.properties.Delegates

interface ControleRemoto {
    fun ligar()
    fun desligar()
}

class ControleRemotoImpl : ControleRemoto {
    override fun ligar() {
        println("Ligando a luz")
    }

    override fun desligar() {
        println("Desligando a luz")
    }
}

// A cláusula by na lista de supertipos de Luz indica que a instância de ControleRemotoImpl
// será armazenada internamente e o compilador gerará automaticamente os métodos da interface
// ControleRemoto, redirecionando para a instância de controle remoto.
class Luz(private val controleRemoto: ControleRemoto) : ControleRemoto by controleRemoto

// lazy() é uma função em Kotlin que recebe um bloco de código (lambda) como argumento e retorna
// uma instância de Lazy<T>, onde T é o tipo do valor que será calculado.
//
// Quando você usa lazy(), está essencialmente criando uma propriedade que não é inicializada
// imediatamente, apenas quando for solicitada.

val minhaPropriedade by lazy {
    println("Inicializando a propriedade")
    "Valor inicial"
}

// Em Kotlin, a função Delegates.observable() é usada para monitorar mudanças em uma propriedade.
// Ela aceita dois argumentos: o valor inicial da propriedade e um manipulador que é chamado sempre
// que a propriedade é atribuída. O manipulador possui três parâmetros: a propriedade em questão,
// o valor antigo e o novo valor.

class User {
    // Exemplo usando Delegates.observable()
    var name: String by Delegates.observable("Sem nome") { property, oldValue, newValue ->
        println("O valor de ${property.name} mudou de $oldValue para $newValue")
    }
}

fun main() {
    val controleRemoto = ControleRemotoImpl()
    val luz = Luz(controleRemoto)

//    luz.ligar()    // Delega para ControleRemotoImpl
//    luz.desligar() // Delega para ControleRemotoImpl

//    println("Antes da primeira chamada")
//    println(minhaPropriedade) // Inicializa a propriedade aqui
//    println("Depois da primeira chamada")
//    println(minhaPropriedade) // Não precisa reinicializar, apenas retorna o valor armazenado

    val user = User()

    user.name = "João" // Saída: O valor de name mudou de Sem nome para João

    println("Nome do usuário: ${user.name}") // Saída: Nome do utilizador: João
}