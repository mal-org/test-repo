package net.leanix.githubwebhooks

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.net.URI

@RestController
@RequestMapping("/books")
class BookController {

    private var books = listOf(
        Book("1", "Title1", "Author1"),
        Book("2", "Title2", "Author2")
    )

    @GetMapping
    fun findAll() = books

    @GetMapping("/{id}")
    fun findById(@PathVariable id: String) =
        books.find { it.id == id } ?: ResponseEntity<Book>(HttpStatus.NOT_FOUND)

    @PostMapping
    fun addBook(@RequestBody book: Book) : ResponseEntity<Void> {
        // Add the book to the list
        books += book
        return ResponseEntity.created(URI.create("/books/${book.id}")).build()
    }
}
data class Book(val id: String, val title: String, val author: String)