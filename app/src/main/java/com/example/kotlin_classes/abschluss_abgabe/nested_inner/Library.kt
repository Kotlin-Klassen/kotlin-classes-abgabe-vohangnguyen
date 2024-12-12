package com.example.kotlin_classes.abschluss_abgabe.nested_inner

import com.example.kotlin_classes.abschluss_abgabe.data.Book
import com.example.kotlin_classes.abschluss_abgabe.sealed_class.BookStatus

/**
 * Represents a library with books and members.
 */
class Library {
    private val books = mutableListOf<Book>()

    /**
     * Represents the address of the library.
     *
     * @property street The street name of the library.
     * @property city The city where the library is located.
     * @property zipCode The zip code of the library's location.
     */
    class LibraryAddress(private val street: String, private val city: String, private val zipCode: String) {
        /**
         * Prints the formatted address of the library.
         */
        fun printAddress() {
            println("\nLibrary Address:")
            println("----------------")
            println("$street, $city $zipCode\n")
        }
    }

    /**
     * Represents a member of the library.
     *
     * @property name The name of the library member.
     * @property memberID The unique identifier for the library member.
     */
    inner class LibraryMember(val name: String, val memberID: String) {
        /**
         * Checks out a book for the member.
         *
         * @param book The book to be checked out.
         * @param dueDate The due date for returning the book.
         */
        fun checkoutBook(book: Book, dueDate: String) {
            book.status = BookStatus.CheckedOut(dueDate)
            println("Book checked out successfully:")
            println("  '${book.title}' by ${book.author}")
            println("  Due date: $dueDate\n")
        }

        /**
         * Reserves a book for the member.
         *
         * @param book The book to be reserved.
         */
        fun reserveBook(book: Book) {
            book.status = BookStatus.Reserved(name)
            println("Book reserved successfully:")
            println("  '${book.title}' by ${book.author}")
            println("  Reserved by: $name\n")
        }
    }

    /**
     * Adds a book to the library's collection.
     *
     * @param book The book to be added.
     */
    fun addBook(book: Book) {
        books.add(book)
    }

    /**
     * Searches for books in the library's collection.
     *
     * @param query The search query to match against book titles or authors.
     * @return A list of books matching the search query.
     */
    fun searchBook(query: String): List<Book> {
        return books.filter { it.title.contains(query, ignoreCase = true) || it.author.contains(query, ignoreCase = true) }
    }

    /**
     * Displays the status of all books in the library's collection.
     */
    fun displayAllBookStatus() {
        println("Current Book Statuses:")
        println("----------------------")
        books.forEachIndexed { index, book ->
            println("${index + 1}. '${book.title}' by ${book.author}")
            print("   Genre: ")
            book.genre.printDescription()
            print("   Status: ")
            book.status.printStatus()
            if (index < books.size - 1) println()
        }
        println()
    }
}
