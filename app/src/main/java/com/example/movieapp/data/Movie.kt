package com.example.movieapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "movies")
data class Movie(
    @PrimaryKey
    val id: Int,
    val title: String,
    val studio: String,
    val genres: String,
    val directors: String,
    val writers: String,
    val actors: String,
    val year: Int,
    val length: Int,
    val shortDescription: String,
    val mpaRating: String,
    val criticsRating: Double
) 