package br.com.trybe.assincronismoerequisicoes.data.models

data class Post(
    private val userId: Int,
    val id: Int,
    val title: String,
    private val body: String
)
