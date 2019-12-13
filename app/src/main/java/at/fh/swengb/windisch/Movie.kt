package at.fh.swengb.windisch

class Movie(val id: String,
            val title: String,
            val release: String,
            val plot: String,
            val genre: MovieGenre,
            val director: Person,
            val actors: List<Person>,
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