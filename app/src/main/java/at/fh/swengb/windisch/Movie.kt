package at.fh.swengb.windisch

import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
open class Movie(val id: String,
                 val title: String,
                 val release: String,
                 val imagePoster: String,
                 val imageBackground: String,
                 val reviews: MutableList<Review>
) {

    fun ratingAverage(): Double{
        var average = reviews.map { it.reviewValue }.average()


        if (average.isNaN()){
            return 0.0
        }
        return  average
    }
}