package com.devb.book_store.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.devb.book_store.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
