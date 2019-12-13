package at.fh.swengb.windisch

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import at.fh.swengb.windisch.MovieRepository.rateMovie
import kotlinx.android.synthetic.main.activity_movie_rating.*

class MovieRating : AppCompatActivity() {

    companion object{
        val RatingReturn = "Rating Return"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_rating)

        val movieId = intent.getStringExtra(MovieDetail.MovieIDRating)

        if (movieId == null) {
            finish()

        } else {

            //output movie title
            rating_title.text = MovieRepository.movieById(movieId)?.title

            rating_button.setOnClickListener {

                val myMovieReviewObject = Review(
                    rating_ratingbar.rating.toDouble(),
                    rating_feedback.text.toString()
                )
                rateMovie(movieId, myMovieReviewObject)

                val resultIntent = Intent()
                resultIntent.putExtra(RatingReturn, movieId)
                setResult(Activity.RESULT_OK, resultIntent)
                finish()
            }
        }
    }
}

