package com.sgilberto.bookmanager.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;

@CrossOrigin(origins = "http://localhost:8081", maxAge = 3600)
@RequestMapping("/book-manager/api/v1")
@Api(tags = { "Book Controller" })
@SwaggerDefinition(tags = {
		@Tag(name = "Book Controller", description = "Set of endpoints for Creating, Retrieving, Updating and Deleting of Books.") })
@RestController
public class BookController {

	@GetMapping("/book")
	@ApiOperation("Returns a book")
	public String helloWorld() {
		return "1984 - George Orwell";
	}

}
