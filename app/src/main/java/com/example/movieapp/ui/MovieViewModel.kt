package com.example.movieapp.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.movieapp.data.Movie
import com.example.movieapp.data.MovieRepository
import kotlinx.coroutines.launch

class MovieViewModel(application: Application) : AndroidViewModel(application) {
    private val repository: MovieRepository = MovieRepository(application)
    private val _movies = MutableLiveData<List<Movie>>()
    val movies: LiveData<List<Movie>> = _movies

    init {
        loadMovies()
    }

    private fun loadMovies() {
        viewModelScope.launch {
            try {
                _movies.value = repository.getAllMovies()
                // If no movies exist, insert initial data
                if (_movies.value.isNullOrEmpty()) {
                    repository.insertAll(MovieRepository.getInitialMovies())
                    _movies.value = repository.getAllMovies()
                }
            } catch (e: Exception) {
                // Handle any errors here
                e.printStackTrace()
            }
        }
    }

    fun searchMovies(query: String) {
        viewModelScope.launch {
            try {
                _movies.value = repository.searchMovies(query)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    fun deleteMovie(movie: Movie) {
        viewModelScope.launch {
            try {
                repository.deleteMovie(movie)
                loadMovies() // Reload the list after deletion
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    suspend fun getMovieById(id: Int): Movie? {
        return try {
            repository.getMovieById(id)
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    fun insert(movie: Movie) {
        viewModelScope.launch {
            try {
                repository.insertMovie(movie)
                loadMovies() // Reload the list after insertion
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    fun update(movie: Movie) {
        viewModelScope.launch {
            try {
                repository.updateMovie(movie)
                loadMovies() // Reload the list after update
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
} 