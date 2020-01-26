package at.fh.swengb.windisch

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
class MovieDetail(val plot: String,
                  val genres: List<String>,
                  val director: Person,
                  val actors:List<Person>,
                  id: String, title: String, release: String,
                  imagePoster: String, imageBackground: String,
                  reviews: MutableList<Review>):Movie(id, title, release, imagePoster, imageBackground, reviews ) {
}