package com.devb.book_store.entity;

import java.util.ArrayList;
import java.util.List;

public class Book {
	
	private Integer id;
	private String nome;
	private String desc;
	
	private Category category;
	private List<Author> authors = new ArrayList<>();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public List<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
	public Book(Integer id, String nome, String desc, Category category, List<Author> authors) {
		super();
		this.id = id;
		this.nome = nome;
		this.desc = desc;
		this.category = category;
		this.authors = authors;
	}
	
	

}
