package at.fh.swengb.windisch

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_movie_detail.*
import kotlinx.android.synthetic.main.activity_movie_review.*

class MovieReviewActivity: AppCompatActivity() {

    companion object{
        val EXTRA_MOVIE_ID_RATING_RETURN = "MOVIE_ID_RATING_RETURN_EXTRA"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_review)

        val movieId = intent.getStringExtra(MovieDetailActivity.EXTRA_MOVIE_ID_RATING)

        if (movieId == null) {
            finish()

        } else {

            MovieRepository.movieDetailById(movieId,
                success = { header_movie_review.text =  it.title },
                error = { Log.e(getString(R.string.API_CALL), it)})



            button_movie_detail.setOnClickListener {

                val myMovieReviewObject = Review(
                    ratingbar_movie_review.rating.toDouble(),
                    text_movie_review.toString()
                )



                MovieRepository.rateMovie( movieId, myMovieReviewObject,
                    success = { Log.i(getString(R.string.API_CALL), getString(R.string.added_review))},
                    error = { Log.e(getString(R.string.API_CALL), it)})

                val resultIntent = Intent()
                resultIntent.putExtra(EXTRA_MOVIE_ID_RATING_RETURN, movieId)
                setResult(Activity.RESULT_OK, resultIntent)
                finish()
            }

        }
    }
}
