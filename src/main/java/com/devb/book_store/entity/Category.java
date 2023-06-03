package com.devb.book_store.entity;

public class Category {
	
	private Integer id;
	private Type type;
	private String desc;
	public Category(Integer id, Type type, String desc) {
		super();
		this.id = id;
		this.type = type;
		this.desc = desc;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Category() {
		
	}
	
	

}
