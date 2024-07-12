package br.com.trybe.multiplasactivities

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


// Os ViewHolders guardam referências para as views dentro do layout, tornando mais eficiente a
// atualização da interface gráfica, são os elementos que serão exibidos.
// É necessario criar uma ViewHolder e estender a classe RecyclerView.ViewHolder,
// que recebe um parâmetro itemView.
// Por padrão, nesta classe é necessario criar um método chamado bind, que será responsável por
// vincular os dados. Este método faz a referência do elemento visual ao item do dataset

// Depois disso, criar o layout do viewHolder
// Criar este layout da mesma forma que se cria um xml de layout. -> movie_item.xml

// Refatorar o codigo para aceitar clickListener

class MovieViewHolder(itemView: View, private val clickListener: IClickEventListener) :
    RecyclerView.ViewHolder(itemView), View.OnClickListener {
    fun bind(movie: Movie) {
        itemView.findViewById<TextView>(R.id.movieTitle).text = movie.title
        itemView.findViewById<TextView>(R.id.movieDirector).text = movie.director
    }

    // utilizar esta inicialização para definir um onClickListener em nosso ViewHolder,
    // para que cada item receba uma forma de interação.
    init {
        itemView.setOnClickListener(this)
    }

    // implementar o onClick
    override fun onClick(p0: View?) {
        //verificando qual é a posição do item na lista
        val position = adapterPosition

        //caso a posição exista, chame o método onItemClick
        if (position != RecyclerView.NO_POSITION) {
            clickListener.onItemClick(position)
        }
    }
}