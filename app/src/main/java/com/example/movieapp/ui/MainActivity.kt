package com.example.movieapp.ui

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.movieapp.R
import com.example.movieapp.data.Movie
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    private lateinit var movieAdapter: MovieAdapter
    private lateinit var movieViewModel: MovieViewModel
    private lateinit var searchEditText: TextInputEditText
    private lateinit var moviesRecyclerView: RecyclerView
    private lateinit var addMovieFab: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        searchEditText = findViewById(R.id.searchEditText)
        moviesRecyclerView = findViewById(R.id.moviesRecyclerView)
        addMovieFab = findViewById(R.id.addMovieFab)

        // Set up RecyclerView
        movieAdapter = MovieAdapter(
            onMovieClick = { movie -> navigateToEditMovie(movie) },
            onDeleteClick = { movie -> deleteMovie(movie) }
        )
        moviesRecyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = movieAdapter
        }

        // Initialize ViewModel
        movieViewModel = ViewModelProvider(this)[MovieViewModel::class.java]
        movieViewModel.movies.observe(this) { movies ->
            movieAdapter.submitList(movies)
        }

        // Set up search functionality
        searchEditText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
            override fun afterTextChanged(s: Editable?) {
                movieViewModel.searchMovies(s.toString())
            }
        })

        // Set up FAB click listener
        addMovieFab.setOnClickListener {
            navigateToEditMovie(null)
        }
    }

    private fun navigateToEditMovie(movie: Movie?) {
        val intent = Intent(this, EditMovieActivity::class.java)
        movie?.let {
            intent.putExtra(EditMovieActivity.EXTRA_MOVIE_ID, it.id)
        }
        startActivity(intent)
    }

    private fun deleteMovie(movie: Movie) {
        movieViewModel.deleteMovie(movie)
        Toast.makeText(this, "Movie deleted", Toast.LENGTH_SHORT).show()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_add_movie -> {
                navigateToEditMovie(null)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
} 