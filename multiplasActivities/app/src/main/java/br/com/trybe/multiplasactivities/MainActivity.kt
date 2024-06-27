package br.com.trybe.multiplasactivities

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// RecyclerView pode ser criado pelo Editor de Layouts, ou diretamente no XML.
// A configuração inicial é parecida com o que é mostrado abaixo:

//<androidx.recyclerview.widget.RecyclerView
//    android:id="@+id/recyclerView"
//    android:layout_width="match_parent"
//    android:layout_height="match_parent" />

// esse data class e lista de Movie é para usar em exemplos, não faz parte do código em si
data class Movie(val title: String, val director: String)

val movieList = listOf(
    Movie("Alien", "Ridley Scott"),
    Movie("La La Land", "Damien Chazelle"),
    Movie("Nomadland", "Chloe Zhao"),
)

// IClickEventListener esta aqui para adicionar um click nos movies

class MainActivity : AppCompatActivity(), IClickEventListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Criado o RecyclerView em nosso design, já podemos vinculá-lo no código Kotlin.
        // Iniciamos o elemento como fizemos com itens visuais anteriores:
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        // Ainda precisa ter um conjunto de dados, vincular este conjunto de dados ao RecyclerView
        // utilizando um Adapter, vincular o conjunto de dados a uma representação visual com o
        // ViewHolder e vincular nosso RecyclerView a um LayoutManager
        // RecyclerView -> conjunto de dados -> Adapter -> ViewHolder -> LayoutManager

        // responsável por medir e posicionar os itens visuais dentro do nosso RecyclerView,
        // e também por definir o critério de quando os itens devem ser reciclados.
        recyclerView.layoutManager = LinearLayoutManager(this) // LinearLayoutManager, para listas verticais simples.

        // Criando o Adapter a partir da lista de filmes
        // Como a Activity implementa o IClickEventListener, ela pode ser passada como
        // parâmetro utilizando a palavra this. Isso é possivel por causa do Polimorfismo.
        val adapter = MovieAdapter(movieList, this)

        //vinculando o adapter ao RecyclerView
        recyclerView.adapter = adapter
    }

    // esta aqui para adicionar click aos movies
    override fun onItemClick(position: Int) {
        val movie = movieList[position]
        Toast.makeText(this, movie.title, Toast.LENGTH_SHORT).show()
    }
}