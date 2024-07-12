package br.com.trybe.assincronismoerequisicoes.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.trybe.assincronismoerequisicoes.R
import br.com.trybe.assincronismoerequisicoes.data.models.Comment
import com.google.android.material.textview.MaterialTextView

class CommentAdapter(private val comments: List<Comment>) :
    RecyclerView.Adapter<CommentAdapter.CommentViewHolder>() {

    class CommentViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nome: MaterialTextView
        val email: MaterialTextView
        val body: MaterialTextView

        init {
            nome = view.findViewById(R.id.item_comment_name)
            email = view.findViewById(R.id.item_comment_email)
            body = view.findViewById(R.id.item_comment_body)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommentViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_comment, parent, false)

        return CommentViewHolder(view)
    }

    override fun getItemCount() = comments.size

    override fun onBindViewHolder(holder: CommentViewHolder, position: Int) {
        holder.nome.text = comments[position].name
        holder.email.text = comments[position].email
        holder.body.text = comments[position].body
    }
}