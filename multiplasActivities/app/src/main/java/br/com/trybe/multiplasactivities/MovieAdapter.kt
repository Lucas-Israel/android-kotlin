package br.com.trybe.multiplasactivities

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

// Com o ViewHolder criado, construir o adapter, sobrescrever os métodos do Adapter para vincular
// os dados de Movie ao nosso layout.

// Nesse caso a classe MovieAdapter recebe uma lista de Movie que serve como dataset e estende
// RecyclerView.Adapter<MovieViewHolder>.

// Como agora temos uma lista, precisamos passar o clickListener para múltiplos itens. Assim,
// cada um deles terá sua interação vinculada ao evento de clique.
class MovieAdapter(
    private val movies: List<Movie>,
    private val clickListener: IClickEventListener // passado para itens da listar serem clicaveis
) : RecyclerView.Adapter<MovieViewHolder>() {

    // Implementar o onCreateViewHolder()
    // iniciar os elementos visuais para cada item da lista, baseado no layout criado em movie_item.xml

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        // aqui é criado um Inflater, e é gerado um inflate, que é o método que cria os elementos,
        // tendo como primeiro parâmetro o layout do elemento que deve ser replicado. Em nosso caso, o movie_item
        val view = LayoutInflater.from(parent.context).inflate(R.layout.movie_item, parent, false)

        // É possivel passar o IClickEventListener ao ViewHolder, que será capaz de enviar o método de
        // clique para os elementos visuais que serão criados.
        return MovieViewHolder(view, clickListener)
    }

    // sobrescrever o método de vínculo onBindViewHolder()
    // Recebe como parâmetro o ViewHolder de filmes, e chama o método bind() para cada um dos
    // elementos de lista.
    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {

        val movie = movies[position]

        holder.bind(movie)
    }

    // o getItemCount() retorna a quantidade de itens:
    override fun getItemCount(): Int {
        return movies.size
    }
}