package com.devb.book_store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devb.book_store.DTO.BookDTO;
import com.devb.book_store.entity.Book;
import com.devb.book_store.service.BookService;


@RestController
@RequestMapping("/v1/store/book")
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@PostMapping
	public ResponseEntity<Book> save(@RequestBody BookDTO bookDTO) {
		Book book = bookService.save(bookDTO);
		return ResponseEntity.status(HttpStatus.CREATED).body(book);
	}
	
}
