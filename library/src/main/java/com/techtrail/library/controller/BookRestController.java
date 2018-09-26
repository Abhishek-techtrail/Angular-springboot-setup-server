package com.techtrail.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techtrail.library.model.Book;
import com.techtrail.library.service.BookService;

@RestController
public class BookRestController {
	@Autowired
	private BookService bookService;
	
	@RequestMapping(value = "/api/books", method = RequestMethod.GET)
	public List<Book> getAllUser() {
		return bookService.getAllBooks();
	}
}
