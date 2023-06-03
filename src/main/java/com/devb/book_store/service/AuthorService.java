package com.devb.book_store.service;

import java.util.List;

import com.devb.book_store.DTO.AuthorDTO;
import com.devb.book_store.entity.Author;

public interface AuthorService {
	
	public Author findByEmail(String email);
	
	public List<Author> getAll();
	
	public Author findById(Integer id);
	
	public Author update(Integer id,AuthorDTO  authorDTO);
	

}
