package com.devb.book_store.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.devb.book_store.DTO.BookDTO;
import com.devb.book_store.entity.Author;
import com.devb.book_store.entity.Book;
import com.devb.book_store.entity.Category;
import com.devb.book_store.repository.BookRepo;


@Service
public class BookServiceImpl  implements BookService{
	
	private final BookRepo bookRepo;
	private final CategoryService categoryService;
	private final AuthorService authorService;


	public BookServiceImpl(BookRepo bookRepo, CategoryService categoryService, AuthorService authorService) {
		super();
		this.bookRepo = bookRepo;
		this.categoryService = categoryService;
		this.authorService = authorService;
	}

	@Override
	public Book save(BookDTO bookDTO) {
		Category category = categoryService.findById(bookDTO.getCategory_id());
		Book book = new Book();
		book.setCategory(category);
		List<Author> listAuthor = new ArrayList<>();
		for(int x: bookDTO.getAuthor_id()) {
			Author author =authorService.findById(x);
			listAuthor.add(author);
	  }
        book.setAuthors(listAuthor);
		book.setNome(bookDTO.getNome());
		book.setDesc(bookDTO.getDesc());
	 
		return bookRepo.save(book);
	}

	@Override
	public List<Book> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
