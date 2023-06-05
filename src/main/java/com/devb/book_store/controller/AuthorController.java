package com.devb.book_store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devb.book_store.DTO.AuthorDTO;
import com.devb.book_store.entity.Author;
import com.devb.book_store.service.AuthorService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/v1/store/author")
public class AuthorController {

	@Autowired
	AuthorService authorService;

	@GetMapping("/all")
	public ResponseEntity<List<Author>> findAll() {
		List<Author> listAuthors = authorService.getAll();
		return ResponseEntity.status(HttpStatus.OK).body(listAuthors);
	}

	@PostMapping
	public ResponseEntity<Author> save(@Valid @RequestBody AuthorDTO authorDTO) {
		Author author = authorService.save(authorDTO);
		return ResponseEntity.status(HttpStatus.CREATED).body(author);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Author> getById(@PathVariable Integer id) {
		Author author = authorService.findById(id);
		return ResponseEntity.status(HttpStatus.OK).body(author);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Author> update(@PathVariable Integer id,@Valid @RequestBody AuthorDTO authorDTO) {
		Author author = authorService.update(id, authorDTO);
		return ResponseEntity.status(HttpStatus.OK).body(author);
	}

	@GetMapping
	public ResponseEntity<Author> findByEMail(@RequestParam String email) {
		Author author = authorService.findByEmail(email);
		return ResponseEntity.status(HttpStatus.OK).body(author);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Author> delete(@PathVariable Integer id){
		authorService.delete(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}

}
