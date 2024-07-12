package br.com.trybe.assincronismoerequisicoes

import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.trybe.assincronismoerequisicoes.data.api.ApiServiceClient
import br.com.trybe.assincronismoerequisicoes.data.models.Comment
import br.com.trybe.assincronismoerequisicoes.ui.adapters.CommentAdapter
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private val apiService = ApiServiceClient.instance

    private val mMenuSelection: AutoCompleteTextView by lazy { findViewById(R.id.menu_selection) }
    private val mCommentList: RecyclerView by lazy { findViewById(R.id.comment_list) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mMenuSelection.setOnItemClickListener { parent, view, position, id ->
            val postTitle = parent.getItemAtPosition(position) as String
            val postId = postTitle.split("-")
                .first()
                .trim()
                .toInt()

            // Corrotinas 05 - Refatorando o onClick dos cards
            CoroutineScope(Dispatchers.IO).launch {
                val commentsResponse = apiService.getCommentsByPostId(postId)

                val comments = commentsResponse.body().orEmpty()
                val adapter = CommentAdapter(comments)

                withContext(Dispatchers.Main) {
                    mCommentList.adapter = adapter
                    mCommentList.layoutManager = LinearLayoutManager(baseContext)

                    adapter.notifyDataSetChanged()
                }

            }
        }


    }

    override fun onStart() {
        super.onStart()

        // Corrotinas 04 - Refatorando onStart

        CoroutineScope(Dispatchers.IO).launch {
            val postResponse = apiService.getPosts()
            postResponse.body()

            val posts = postResponse.body()
            val postTitles = posts?.map { "${it.id} - ${it.title}" }?.toList().orEmpty()
            val adapter =
                ArrayAdapter(baseContext, android.R.layout.simple_list_item_1, postTitles)
            withContext(Dispatchers.Main) {
                mMenuSelection.setAdapter(adapter)
            }
        }
    }
}