package com.devb.book_store.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "book_tb")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String desc;
	private String ref;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "book_id", referencedColumnName = "id")
	private Category category;
	
	
	@ManyToMany
	private List<Author> authors = new ArrayList<>();

	
	
	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String nome) {
		this.name = nome;
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

	@ManyToMany(mappedBy = "books")
	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	public Book(Integer id, String nome, String desc, Category category, List<Author> authors,String ref) {
		super();
		this.id = id;
		this.name = nome;
		this.desc = desc;
		this.category = category;
		this.authors = authors;
		this.ref = ref;
	}

	public Book() {
		
	}
}
