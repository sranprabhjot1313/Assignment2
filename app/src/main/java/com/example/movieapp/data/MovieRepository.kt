package com.example.movieapp.data

import android.content.Context
import androidx.room.Room
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MovieRepository(context: Context) {
    private val movieDao = MovieDatabase.getDatabase(context.applicationContext).movieDao()

    suspend fun getAllMovies(): List<Movie> = withContext(Dispatchers.IO) {
        movieDao.getAllMovies()
    }

    suspend fun getMovieById(id: Int): Movie? = withContext(Dispatchers.IO) {
        movieDao.getMovieById(id)
    }

    suspend fun searchMovies(query: String): List<Movie> = withContext(Dispatchers.IO) {
        movieDao.searchMovies("%$query%")
    }

    suspend fun insertMovie(movie: Movie) = withContext(Dispatchers.IO) {
        movieDao.insertMovie(movie)
    }

    suspend fun updateMovie(movie: Movie) = withContext(Dispatchers.IO) {
        movieDao.updateMovie(movie)
    }

    suspend fun deleteMovie(movie: Movie) = withContext(Dispatchers.IO) {
        movieDao.deleteMovie(movie)
    }

    suspend fun deleteAll() = withContext(Dispatchers.IO) {
        movieDao.deleteAll()
    }

    suspend fun insertAll(movies: List<Movie>) = withContext(Dispatchers.IO) {
        movieDao.insertAll(movies)
    }

    companion object {
        fun getInitialMovies(): List<Movie> {
            return listOf(
                Movie(
                    id = 1,
                    title = "Star Wars: Episode V - The Empire Strikes Back",
                    studio = "Twentieth Century Fox",
                    genres = "Action, Adventure, Fantasty",
                    directors = "Irvin Kershner",
                    writers = "Leigh Brackett, Lawrence Kasdan, George Lucas",
                    actors = "Mark Hamill, Harrison Ford, Carrie Fisher",
                    year = 1980,
                    length = 124,
                    shortDescription = "After the Rebels are overpowered by the Empire, Luke Skywalker begins his Jedi training with Yoda, while his friends are pursued across the galaxy by Darth Vader and bounty hunter Boba Fett.",
                    mpaRating = "PG",
                    criticsRating = 8.7
                ),
                Movie(
                    id = 2,
                    title = "The Matrix",
                    studio = "Warner Bros. Pictures",
                    genres = "Action, Sci-Fi",
                    directors = "Lana Wachowski, Lilly Wachowski",
                    writers = "Lana Wachowski, Lilly Wachowski",
                    actors = "Keanu Reaves, Laurence Fishburne, Carrie-Anne Moss",
                    year = 1999,
                    length = 136,
                    shortDescription = "When a beautiful stranger leads computer hacker Neo to a forbidding underworld, he discovers the shocking truth--the life he knows is the elaborate deception of an evil cyber-intelligence.",
                    mpaRating = "R",
                    criticsRating = 8.7
                ),
                Movie(
                    id = 3,
                    title = "Star Wars: Episode IV - A New Hope",
                    studio = "Twentieth Century Fox",
                    genres = "Action, Adventure, Fantasty",
                    directors = "George Lucas",
                    writers = "George Lucas",
                    actors = "Mark Hamill, Harrison Ford, Carrie Fisher",
                    year = 1977,
                    length = 121,
                    shortDescription = "Luke Skywalker joins forces with a Jedi Knight, a cocky pilot, a Wookiee and two droids to save the galaxy from the Empires world-destroying battle station, while also attempting to rescue Princess Leia from the mysterious Darth Vader",
                    mpaRating = "PG",
                    criticsRating = 8.7
                ),
                Movie(
                    id = 4,
                    title = "Back to the Future",
                    studio = "Universal Pictures",
                    genres = "Adventure, Comedy, Sci-Fi",
                    directors = "Robert Zemeckis",
                    writers = "Robet Zemeckis, Bob Gale",
                    actors = "Michael J. Fox, Christopher Lloyd, Lea Thompson",
                    year = 1985,
                    length = 144,
                    shortDescription = "Marty McFly, a 17-year-old high school student, is accidentally sent 30 years into the past in a time-traveling DeLorean invented by his close friend, the maverick scientist Doc Brown.",
                    mpaRating = "PG",
                    criticsRating = 8.5
                ),
                Movie(
                    id = 5,
                    title = "Alien",
                    studio = "Twentieth Century Fox",
                    genres = "Horror, Sci-Fi",
                    directors = "Ridley Scott",
                    writers = "Dan O Bannon, Ronald Shusett",
                    actors = "Sigourney Weaver, Tom Skerritt, John Hurt",
                    year = 1985,
                    length = 117,
                    shortDescription = "The crew of a commercial spacecraft encounter a deadly lifeform after investigating an unknown transmission.",
                    mpaRating = "R",
                    criticsRating = 8.5
                )
            )
        }
    }
} 