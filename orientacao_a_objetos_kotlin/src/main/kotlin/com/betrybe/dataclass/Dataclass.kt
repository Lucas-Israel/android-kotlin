package com.betrybe.dataclass

// As data class em Kotlin são classes cujo objetivo principal é guardar dados.
// As data class vêm automaticamente com funções adicionais que lhe permitem imprimir uma instância
// para uma saída legível, comparar instâncias, copiar instâncias e muito mais. As data class são
// marcadas com a palavra reservada data

data class User(val name: String, val age: Int)

//O compilador deriva automaticamente os seguintes membros de todas as propriedades declaradas no construtor primário:
//o par de funções equals() e hashCode()
//a função toString() com o formato “User(name=John, age=42)”
//Funções componentN() correspondentes às propriedades na sua ordem de declaração.
//Função copy().

//O construtor primário tem de ter pelo menos um parâmetro.
//Todos os parâmetros do construtor primário têm de ser marcados como val ou var.
//As classes de dados não podem ser abstratas (abstract), abertas (open), seladas (sealed) ou internas.

// Armazenamento de Dados Simples

data class Ponto(val x: Int, val y: Int)