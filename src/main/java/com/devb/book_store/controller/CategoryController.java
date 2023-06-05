package com.devb.book_store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devb.book_store.entity.Category;
import com.devb.book_store.service.CategoryService;

@RestController
@RequestMapping("/v1/store/category")
public class CategoryController {
	
	@Autowired
	CategoryService categoryService;
	
	@PostMapping
	public ResponseEntity<Category> save(@RequestBody Category category){
		Category ct = categoryService.save(category);
		return ResponseEntity.status(HttpStatus.CREATED).body(ct);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Category>> findAll(){
		List<Category> categories= categoryService.getAll();		
		return ResponseEntity.status(HttpStatus.OK).body(categories);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Category> findById(@PathVariable Integer id){
		Category category = categoryService.findById(id);
		return ResponseEntity.status(HttpStatus.OK).body(category);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Category> deleteById(@PathVariable Integer id){
		categoryService.delete(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}

}
