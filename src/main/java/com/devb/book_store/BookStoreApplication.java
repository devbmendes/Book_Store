package com.devb.book_store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devb.book_store.entity.Author;
import com.devb.book_store.repository.AuthorRepositoy;


@SpringBootApplication
public class BookStoreApplication implements CommandLineRunner {
	
	@Autowired
	AuthorRepositoy repositoy;

	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Author author1 = new Author(null, "Balduino", "Mendes", "baldhuino@gmail.com");
		Author author2 = new Author(null, "Helton", "Soares", "helton@gmail.com");
		repositoy.save(author1);
		repositoy.save(author2);
		
	}

}
