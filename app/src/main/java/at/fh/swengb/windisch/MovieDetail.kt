package at.fh.swengb.windisch

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_movie_detail.*

class MovieDetail : AppCompatActivity() {

    companion object {
        val MovieIDRating = "Movie ID Rating"
        val RatingReqest = 1
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)

        val movieId = intent.getStringExtra(MainActivity.MovieID)

        if (movieId == null){
            Log.e("Error","No Movie id!")
            finish()
        } else {

            outputMovieDetails(movieId)

            detail_button.setOnClickListener{
                val intent = Intent(this, MovieRating ::class.java)
                intent.putExtra(MovieIDRating, MovieRepository.movieById(movieId)?.id)
                startActivityForResult(intent, RatingReqest)
            }

        }

    }

    private fun outputMovieDetails(inputId: String){

        detail_movie_title.text =  MovieRepository.movieById(inputId)?.title
        detail_movie_director_name.text = MovieRepository.movieById(inputId)?.director?.name
        detail_movie_actors_name.text = MovieRepository.movieById(inputId)?.actors?.joinToString { it.name }
        detail_genre_name.text = MovieRepository.movieById(inputId)?.genre.toString()
        detail_avg_ratingbar.rating = MovieRepository.movieById(inputId)?.ratingAverage()?.toFloat() ?: 0.toFloat()
        detail_avg_ratings.text = MovieRepository.movieById(inputId)?.ratingAverage().toString()
        detail_rating_count.text = MovieRepository.movieById(inputId)?.reviews?.count().toString()
        detail_release_name.text = MovieRepository.movieById(inputId)?.release
        detail_plot_description.text = MovieRepository.movieById(inputId)?.plot
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == RatingReqest && resultCode == Activity.RESULT_OK) {

            val movieReturnId = data?.getStringExtra(MovieRating.RatingReturn)
            if(movieReturnId != null){
                outputMovieDetails(movieReturnId)
            }

        }
    }
}
