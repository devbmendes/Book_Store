package com.devb.book_store.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devb.book_store.DTO.AuthorDTO;
import com.devb.book_store.entity.Author;
import com.devb.book_store.repository.AuthorRepositoy;
import com.devb.book_store.service.exception.ObjectNotFoundException;

@Service
public class AuthorServiceImp implements AuthorService {

	@Autowired
	AuthorRepositoy authorRepositoy;

	@Override
	public Author findByEmail(String email) {
		Optional<Author> autorOptional = authorRepositoy.findByEmail(email);
		
		return autorOptional.orElseThrow(()->
		new ObjectNotFoundException("Author with EMAIL: "+email+ "not found"));
	}

	@Override
	public List<Author> getAll() {

		List<Author> lstAuthors = authorRepositoy.findAll();
		return lstAuthors;
	}

	@Override
	public Author findById(Integer id) {
		Optional<Author> author = authorRepositoy.findById(id);
		
		return author.orElseThrow(()->
		new ObjectNotFoundException("Author with ID: "+id+" not found"));
	}

	@Override
	public Author update(Integer id, AuthorDTO authorDTO) {
		Author autOptional = findById(id);
		Optional<Author> auOptional = authorRepositoy.findByEmail(authorDTO.getEmail());
		//if(autOptional.getEmail().equalsIgnoreCase(authorDTO.getEmail()))
		Author author = new Author(id, authorDTO.getFirstname(), authorDTO.getLastname(), authorDTO.getEmail());
		return authorRepositoy.save(author);
	}

	@Override
	public Author save(AuthorDTO authorDTO) {
		checkIfEmailisPresent(null,authorDTO.getEmail());
		Author author = new Author(null, authorDTO.getFirstname(), authorDTO.getLastname(), authorDTO.getEmail());

		return authorRepositoy.save(author);
	}

	@Override
	public Author checkIfEmailisPresent(Integer id, String email) {
		Optional<Author> authorOptional = authorRepositoy.findByEmail(email);

		return authorOptional.orElseThrow();
	}

}
