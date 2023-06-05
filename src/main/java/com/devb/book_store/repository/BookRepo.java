package com.devb.book_store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devb.book_store.entity.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {

}
