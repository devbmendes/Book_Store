package com.devb.book_store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.devb.book_store.entity.Author;
import com.devb.book_store.service.AuthorService;

@RestController("/api/v1/book")
public class AuthorController {
	
	@Autowired
	AuthorService authorService;
	
	public ResponseEntity<List<Author>> findAll(){
		
		List<Author> listAuthors = authorService.getAll();
		return ResponseEntity.status(HttpStatus.OK).body( listAuthors);
	}

}
