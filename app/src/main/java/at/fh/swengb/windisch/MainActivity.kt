package at.fh.swengb.windisch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.movie_recycler_view

class MainActivity : AppCompatActivity() {

    companion object {
        val MovieID = "Movie ID"
    }


    val movieAdapter = MovieAdapter(){

        val intent = Intent(this, MovieDetail ::class.java)
        intent.putExtra(MovieID, it.id)
        startActivity(intent)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        movieAdapter.updateList(MovieRepository.movieList())
        movie_recycler_view.layoutManager = LinearLayoutManager(this)
        movie_recycler_view.adapter = movieAdapter
    }



    override fun onRestart() {
        super.onRestart()

        movieAdapter.updateList(MovieRepository.movieList())
    }


}
