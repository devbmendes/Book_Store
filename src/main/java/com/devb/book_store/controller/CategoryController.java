package com.devb.book_store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devb.book_store.entity.Category;
import com.devb.book_store.repository.CategoryRepository;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	CategoryRepository categoryRepository;
	
	public ResponseEntity<List<Category>> findAll(){
		List<Category> categories= categoryRepository.findAll();
		
		return ResponseEntity.status(HttpStatus.OK).body(categories);
	}

}
