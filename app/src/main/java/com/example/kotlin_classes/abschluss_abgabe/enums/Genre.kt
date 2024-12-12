package com.example.kotlin_classes.abschluss_abgabe.enums

/**
 * Enum class representing different genres of books in the library.
 *
 * @property description A brief description of the genre.
 */
enum class Genre(private val description: String) {
    /**
     * Represents fictional stories and novels.
     */
    FICTION("Fictional stories and novels"),

    /**
     * Represents factual books and documentaries.
     */
    NON_FICTION("Factual books and documentaries"),

    /**
     * Represents scientific literature and research.
     */
    SCIENCE("Scientific literature and research"),

    /**
     * Represents books about historical events and figures.
     */
    HISTORY("Books about historical events and figures"),

    /**
     * Represents literature for young readers.
     */
    CHILDREN("Literature for young readers");

    /**
     * Prints the description of the genre.
     */
    fun printDescription() {
        println(description)
    }
}
