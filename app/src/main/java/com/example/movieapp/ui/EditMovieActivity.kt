package com.example.movieapp.ui

import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.movieapp.R
import com.example.movieapp.data.Movie
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class EditMovieActivity : AppCompatActivity() {
    private lateinit var viewModel: MovieViewModel
    private var movieId: Int = -1

    private lateinit var screenTitle: TextView
    private lateinit var titleEditText: TextInputEditText
    private lateinit var studioEditText: TextInputEditText
    private lateinit var genresEditText: TextInputEditText
    private lateinit var directorsEditText: TextInputEditText
    private lateinit var writersEditText: TextInputEditText
    private lateinit var actorsEditText: TextInputEditText
    private lateinit var yearEditText: TextInputEditText
    private lateinit var lengthEditText: TextInputEditText
    private lateinit var descriptionEditText: TextInputEditText
    private lateinit var mpaRatingEditText: TextInputEditText
    private lateinit var ratingBar: RatingBar
    private lateinit var saveButton: MaterialButton
    private lateinit var cancelButton: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_movie)

        viewModel = ViewModelProvider(this)[MovieViewModel::class.java]
        
        screenTitle = findViewById(R.id.screenTitle)
        titleEditText = findViewById(R.id.titleEditText)
        studioEditText = findViewById(R.id.studioEditText)
        genresEditText = findViewById(R.id.genresEditText)
        directorsEditText = findViewById(R.id.directorsEditText)
        writersEditText = findViewById(R.id.writersEditText)
        actorsEditText = findViewById(R.id.actorsEditText)
        yearEditText = findViewById(R.id.yearEditText)
        lengthEditText = findViewById(R.id.lengthEditText)
        descriptionEditText = findViewById(R.id.descriptionEditText)
        mpaRatingEditText = findViewById(R.id.mpaRatingEditText)
        ratingBar = findViewById(R.id.ratingBar)
        saveButton = findViewById(R.id.saveButton)
        cancelButton = findViewById(R.id.cancelButton)

        movieId = intent.getIntExtra(EXTRA_MOVIE_ID, -1)
        
        if (movieId != -1) {
            screenTitle.text = "Edit Movie"
            loadMovie()
        } else {
            screenTitle.text = "Add New Movie"
            ratingBar.rating = 0f
        }

        saveButton.setOnClickListener {
            if (validateInput()) {
                saveMovie()
            }
        }

        cancelButton.setOnClickListener {
            finish()
        }
    }

    private fun validateInput(): Boolean {
        val title = titleEditText.text.toString().trim()
        val studio = studioEditText.text.toString().trim()
        val genres = genresEditText.text.toString().trim()
        val directors = directorsEditText.text.toString().trim()
        val writers = writersEditText.text.toString().trim()
        val actors = actorsEditText.text.toString().trim()
        val year = yearEditText.text.toString().trim()
        val length = lengthEditText.text.toString().trim()
        val description = descriptionEditText.text.toString().trim()
        val mpaRating = mpaRatingEditText.text.toString().trim()

        var isValid = true

        if (title.isEmpty()) {
            titleEditText.error = "Title is required"
            isValid = false
        }

        if (studio.isEmpty()) {
            studioEditText.error = "Studio name is required"
            isValid = false
        }

        if (genres.isEmpty()) {
            genresEditText.error = "Genres are required"
            isValid = false
        }

        if (directors.isEmpty()) {
            directorsEditText.error = "Directors are required"
            isValid = false
        }

        if (writers.isEmpty()) {
            writersEditText.error = "Writers are required"
            isValid = false
        }

        if (actors.isEmpty()) {
            actorsEditText.error = "Actors are required"
            isValid = false
        }

        if (year.isEmpty()) {
            yearEditText.error = "Year is required"
            isValid = false
        }

        if (length.isEmpty()) {
            lengthEditText.error = "Length is required"
            isValid = false
        }

        if (description.isEmpty()) {
            descriptionEditText.error = "Description is required"
            isValid = false
        }

        if (mpaRating.isEmpty()) {
            mpaRatingEditText.error = "MPA Rating is required"
            isValid = false
        }

        return isValid
    }

    private fun loadMovie() {
        CoroutineScope(Dispatchers.IO).launch {
            val movie = viewModel.getMovieById(movieId)
            withContext(Dispatchers.Main) {
                movie?.let {
                    titleEditText.setText(it.title)
                    studioEditText.setText(it.studio)
                    genresEditText.setText(it.genres)
                    directorsEditText.setText(it.directors)
                    writersEditText.setText(it.writers)
                    actorsEditText.setText(it.actors)
                    yearEditText.setText(it.year.toString())
                    lengthEditText.setText(it.length.toString())
                    descriptionEditText.setText(it.shortDescription)
                    mpaRatingEditText.setText(it.mpaRating)
                    ratingBar.rating = it.criticsRating.toFloat()
                }
            }
        }
    }

    private fun saveMovie() {
        val title = titleEditText.text.toString().trim()
        val studio = studioEditText.text.toString().trim()
        val genres = genresEditText.text.toString().trim()
        val directors = directorsEditText.text.toString().trim()
        val writers = writersEditText.text.toString().trim()
        val actors = actorsEditText.text.toString().trim()
        val year = yearEditText.text.toString().trim().toIntOrNull() ?: 0
        val length = lengthEditText.text.toString().trim().toIntOrNull() ?: 0
        val description = descriptionEditText.text.toString().trim()
        val mpaRating = mpaRatingEditText.text.toString().trim()
        val rating = ratingBar.rating.toDouble()

        val movie = Movie(
            id = if (movieId == -1) 0 else movieId,
            title = title,
            studio = studio,
            genres = genres,
            directors = directors,
            writers = writers,
            actors = actors,
            year = year,
            length = length,
            shortDescription = description,
            mpaRating = mpaRating,
            criticsRating = rating
        )

        if (movieId == -1) {
            viewModel.insert(movie)
        } else {
            viewModel.update(movie)
        }

        finish()
    }

    companion object {
        const val EXTRA_MOVIE_ID = "extra_movie_id"
    }
} 