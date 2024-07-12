package br.com.trybe.assincronismoerequisicoes.data.api

import br.com.trybe.assincronismoerequisicoes.data.models.Comment
import br.com.trybe.assincronismoerequisicoes.data.models.Post
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    // Corrotinas 02 - adicionando suspend, que permite as funcoes serem usadas dentro do
    // coroutines e serem pausadas

    // Corrotinas 03 - Mudar o Call para retrofit2.Response
    @GET("/posts")
    suspend fun getPosts(): Response<List<Post>>

    @GET("/posts/{postId}/comments")
    suspend fun getCommentsByPostId(@Path("postId") postId: Int): Response<List<Comment>>
}