package com.example.kotlin_classes.abschluss_abgabe

import com.example.kotlin_classes.abschluss_abgabe.data.Book
import com.example.kotlin_classes.abschluss_abgabe.enums.Genre
import com.example.kotlin_classes.abschluss_abgabe.nested_inner.Library
import com.example.kotlin_classes.abschluss_abgabe.sealed_class.BookStatus

/**
 * Main function to demonstrate the Library Management System.
 */
fun main() {
    val library = Library()

    library.addBook(Book("1984", "George Orwell", Genre.FICTION, BookStatus.Available))
    library.addBook(Book("A Brief History of Time", "Stephen Hawking", Genre.SCIENCE, BookStatus.Available))
    library.addBook(Book("The Cat in the Hat", "Dr. Seuss", Genre.CHILDREN, BookStatus.Available))

    println("Library Management System")
    println("========================================")

    val address = Library.LibraryAddress("Main St. 1", "Heilbronn", "74074")
    address.printAddress()

    val member = library.LibraryMember("Max Mustermann", "JD001")
    println("New member created: ${member.name} (ID: ${member.memberID})\n")

    val book1 = library.searchBook("1984").firstOrNull()
    val book2 = library.searchBook("Brief History").firstOrNull()

    if (book1 != null) member.checkoutBook(book1, "2024-12-15")
    if (book2 != null) member.reserveBook(book2)

    library.displayAllBookStatus()

    println("Library operations completed.")
}
