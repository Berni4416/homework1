package at.fh.swengb.windisch

import android.app.Activity
import android.content.Intent
import android.content.res.Resources
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_movie_detail.*
import kotlinx.android.synthetic.main.movie_item.*
import java.math.RoundingMode
import java.text.DecimalFormat


class MovieDetailActivity : AppCompatActivity() {

    companion object {
        val EXTRA_MOVIE_ID_RATING = "MOVIE_ID_RATING_EXTRA"
        val ADD_OR_EDIT_RATING_REQUEST = 1
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)

        val movieId = intent.getStringExtra(MainActivity.EXTRA_MOVIE_ID)



        if (movieId == null){
            Log.e(getString(R.string.PASSING_ERROR),getString(R.string.PASSING_ERROR_CONTENT))
            finish()
        } else {

            //output movie details
            outputMovieDetails(movieId)

            //open next activity
            button_movie_detail.setOnClickListener{
                val intent = Intent(this, MovieReviewActivity ::class.java)

                intent.putExtra(EXTRA_MOVIE_ID_RATING, movieId)
                startActivityForResult(intent, ADD_OR_EDIT_RATING_REQUEST)
            }

        }

    }

    private fun outputMovieDetails(inputId: String){

        MovieRepository.movieDetailById(inputId,
            success = { val movie =  it
                if(movie == null){
                    Log.e(getString(R.string.PASSING_ERROR),getString(R.string.PASSING_ERROR_CONTENT))
                    finish()
                } else{

                    val myDecimalFormat = DecimalFormat("#.####")
                    myDecimalFormat.roundingMode = RoundingMode.CEILING

                    title_movie_detail.text =  movie.title
                    output_director_movie_detail.text = movie.director.name
                    output_actors_movie_detail.text = movie.actors.joinToString { it.name }
                    output_genre_movie_detail.text = movie.genres.joinToString { it }
                    ratingbar_movie_detail.rating = movie.ratingAverage().toFloat()
                    ratings_movie_detail.text = myDecimalFormat.format(movie.ratingAverage())
                    rating_count_movie_detail.text = movie.reviews.count().toString()
                    release_movie_detail.text = movie.release
                    description_movie_detail.text = movie.plot


                    Glide
                        .with(image_movie_detail)
                        .load(movie.imagePoster)
                        .into(image_movie_detail)

                    Glide
                        .with(image_background_movie_detail)
                        .load(movie.imageBackground)
                        .into(image_background_movie_detail)
                }
            },
            error = { Log.e(getString(R.string.API_CALL), it)})
    }



    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == ADD_OR_EDIT_RATING_REQUEST && resultCode == Activity.RESULT_OK) {
            //Output updated content
            val movieReturnId = data?.getStringExtra(MovieReviewActivity.EXTRA_MOVIE_ID_RATING_RETURN)
            if(movieReturnId != null){
                outputMovieDetails(movieReturnId)
            }

        }
    }




}
