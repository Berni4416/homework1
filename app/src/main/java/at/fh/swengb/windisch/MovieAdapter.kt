package at.fh.swengb.windisch

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.movie_item.view.*

class MovieAdapter(val clickListener: (movie: Movie) -> Unit): RecyclerView.Adapter<MovieViewHolder>(){

    private var listofMovie = listOf<Movie>()

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): MovieViewHolder {
        val layoutinflater = LayoutInflater.from(parent.context)
        val movieItemView = layoutinflater.inflate(R.layout.movie_item, parent, false)
        return MovieViewHolder(movieItemView, clickListener)
    }

    override fun getItemCount(): Int {
        return listofMovie.size
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        var movie = listofMovie[position]
        holder.bindItem(movie)
    }

    fun updateList(newList: List<Movie>) {
        listofMovie = newList
        notifyDataSetChanged()
    }

}

class MovieViewHolder(itemView: View, val clickListener: (movie: Movie) -> Unit): RecyclerView.ViewHolder(itemView){
    fun bindItem(movie: Movie){


        itemView.item_name.text = movie.title
        itemView.item_release_date.text = movie.release
        itemView.item_actor_1.text = movie.actors[0]?.name
        itemView.item_actor_2.text = movie.actors[1]?.name

        itemView.item_avg_rating_bar.rating = movie.ratingAverage().toFloat()
        itemView.item_avg_rating_value.text = movie.ratingAverage().toString()
        itemView.item_rating_count.text = movie.reviews.count().toString()

        itemView.setOnClickListener{
            clickListener(movie)
        }

    }

}