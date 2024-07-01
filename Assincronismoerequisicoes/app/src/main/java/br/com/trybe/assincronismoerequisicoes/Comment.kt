package br.com.trybe.assincronismoerequisicoes

data class Comment(
    private val postId : Int,
    private val id: Int,
    private val name: String,
    private val email: String,
    private val body: String
)
