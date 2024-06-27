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

class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(movie: Movie) {
        itemView.findViewById<TextView>(R.id.movieTitle).text = movie.title
        itemView.findViewById<TextView>(R.id.movieDirector).text = movie.director
    }
}