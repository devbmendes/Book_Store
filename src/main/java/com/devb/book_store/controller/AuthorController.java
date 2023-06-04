package com.devb.book_store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devb.book_store.DTO.AuthorDTO;
import com.devb.book_store.entity.Author;
import com.devb.book_store.service.AuthorService;

@RestController
@RequestMapping("/api/v1/book")
public class AuthorController {
	
	@Autowired
	AuthorService authorService;
	
	@GetMapping
	public ResponseEntity<List<Author>> findAll(){
		
		List<Author> listAuthors = authorService.getAll();
		return ResponseEntity.status(HttpStatus.OK).body( listAuthors);
	}
	
	@PostMapping
	public ResponseEntity<Author> save(AuthorDTO authorDTO) {
		Author author = authorService.save(authorDTO);
		return ResponseEntity.status(HttpStatus.CREATED).body(author);
	}
	@PutMapping("/{id}")
	public ResponseEntity<Author> update(@PathVariable Integer id,AuthorDTO authorDTO){
		Author author = authorService.update(id, authorDTO);
		return ResponseEntity.status(HttpStatus.OK).body(author);
	}
	

}
