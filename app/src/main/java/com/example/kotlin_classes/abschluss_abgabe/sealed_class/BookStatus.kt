package com.example.kotlin_classes.abschluss_abgabe.sealed_class

/**
 * Sealed class representing the possible statuses of a book in the library.
 */
sealed class BookStatus {
    /**
     * Represents a book that is available for checkout.
     */
    object Available : BookStatus()

    /**
     * Represents a book that has been checked out.
     *
     * @property dueDate The due date for the book to be returned.
     */
    data class CheckedOut(val dueDate: String) : BookStatus()

    /**
     * Represents a book that has been reserved.
     *
     * @property reservedBy The name or ID of the person who reserved the book.
     */
    data class Reserved(val reservedBy: String) : BookStatus()

    /**
     * Prints the status of the book.
     */
    fun printStatus() {
        when (this) {
            is Available -> println("Available")
            is CheckedOut -> println("Checked Out (Due: ${dueDate})")
            is Reserved -> println("Reserved by $reservedBy")
        }
    }
}
