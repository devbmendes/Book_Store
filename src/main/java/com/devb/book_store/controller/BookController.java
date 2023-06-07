package com.devb.book_store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devb.book_store.DTO.BookDTO;
import com.devb.book_store.entity.Book;
import com.devb.book_store.service.BookService;


@RestController
@RequestMapping("/v1/store/book")
@CrossOrigin("**")
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@PostMapping
	public ResponseEntity<Book> save(@RequestBody BookDTO bookDTO) {
		Book book = bookService.save(bookDTO);
		return ResponseEntity.status(HttpStatus.CREATED).body(book);
	}
	@GetMapping("/all")
	public ResponseEntity<List<Book>> getAll(){
		List<Book> lisBooks = bookService.getAll();
		return ResponseEntity.status(HttpStatus.OK).body(lisBooks);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Book> findById(@PathVariable Integer id){
		Book book = bookService.getById(id);
		return ResponseEntity.status(HttpStatus.OK).body(book);
	}
	
	@GetMapping
	public ResponseEntity<Book> findByName(@RequestParam(value = "name") String name){
		Book book = bookService.findByNameIgnoreCase(name);
		return ResponseEntity.status(HttpStatus.OK).body(book);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable Integer id){
		bookService.delete(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
	
}
