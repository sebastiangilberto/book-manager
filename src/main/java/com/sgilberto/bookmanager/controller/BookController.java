package com.sgilberto.bookmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgilberto.bookmanager.entity.Book;
import com.sgilberto.bookmanager.service.BookService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RequestMapping("/book-manager/api/v1/book")
@Api(tags = { "book" })
@SwaggerDefinition(tags = {
		@Tag(name = "book", description = "Set of endpoints for Creating, Retrieving, Updating and Deleting of Books.") })
@RestController
public class BookController {

	@Autowired
	private BookService service;

	@PostMapping
	@ApiOperation("Creates a book")
	public ResponseEntity<Book> create(Book book) {
		Book newBook = this.service.create(book);
		return ResponseEntity.ok().body(newBook);
	}

	@GetMapping(path = { "/{id}" })
	@ApiOperation("Returns a book")
	public ResponseEntity<Book> findOne(@PathVariable("id") int id) {
		Book book = this.service.findById(id);
		return ResponseEntity.ok().body(book);
	}

	@PutMapping
	@ApiOperation("Updates a book")
	public ResponseEntity<Book> update(Book book) {
		Book updatedBook = this.service.update(book);
		return ResponseEntity.ok().body(updatedBook);
	}

	@DeleteMapping(path = { "/{id}" })
	@ApiOperation("Deletes a book")
	public ResponseEntity<Book> delete(@PathVariable("id") int id) {
		Book book = this.service.delete(id);
		return ResponseEntity.ok().body(book);
	}

	@GetMapping
	public ResponseEntity<List<Book>> findAll() {
		List<Book> books = this.service.findAll();
		return ResponseEntity.ok().body(books);
	}

}
