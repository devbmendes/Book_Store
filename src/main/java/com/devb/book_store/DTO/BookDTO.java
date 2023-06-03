package com.devb.book_store.DTO;

public class BookDTO {

	private String nome;
	private String desc;
	private Integer category_id;
	private Integer author_id[];
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
	public Integer getCategory_id() {
		return category_id;
	}
	public void setCategory_id(Integer category_id) {
		this.category_id = category_id;
	}
	public Integer[] getAuthor_id() {
		return author_id;
	}
	public void setAuthor_id(Integer[] author_id) {
		this.author_id = author_id;
	}
	public BookDTO(String nome, String desc, Integer category_id, Integer[] author_id) {
		super();
		this.nome = nome;
		this.desc = desc;
		this.category_id = category_id;
		this.author_id = author_id;
	}
	public BookDTO() {
		
	}

	
}
