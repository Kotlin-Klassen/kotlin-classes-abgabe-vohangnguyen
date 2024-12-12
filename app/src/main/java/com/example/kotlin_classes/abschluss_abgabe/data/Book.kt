package com.example.kotlin_classes.abschluss_abgabe.data

import com.example.kotlin_classes.abschluss_abgabe.enums.Genre
import com.example.kotlin_classes.abschluss_abgabe.sealed_class.BookStatus

data class Book(
    val title: String,
    val author: String,
    val genre: Genre,
    var status: BookStatus
)