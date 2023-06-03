package com.devb.book_store.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.devb.book_store.DTO.AuthorDTO;
import com.devb.book_store.entity.Author;
import com.devb.book_store.repository.AuthorRepositoy;

public class AuthorServiceImp implements AuthorService{
	
	@Autowired
	AuthorRepositoy authorRepositoy;

	@Override
	public Author findByEmail(String email) {
		Optional<Author> autorOptional = authorRepositoy.findByEmail(email);
		if(autorOptional.isPresent()) {
			return autorOptional.get();
		}
		return null;
	}

	@Override
	public List<Author> getAll() {
	
		List<Author> lstAuthors = authorRepositoy.findAll();
		return lstAuthors;
	}

	@Override
	public Author findById(Integer id) {
		Optional<Author> author = authorRepositoy.findById(id);
		if(author.isPresent()) {
			return author.get();
		}
		return null;
	}

	@Override
	public Author update(Integer id, AuthorDTO authorDTO) {
		Author author = new Author(id,authorDTO.getFirstname(),authorDTO.getLastname(),authorDTO.getEmail());
		return authorRepositoy.save(author);
	}

}
