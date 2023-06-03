package com.devb.book_store.entity;

import java.util.ArrayList;
import java.util.List;

public class Category {

	private Integer id;
	private String type;
	private String desc;

	private List<Book> books = new ArrayList<>();

	public Category(Integer id, String type, String desc) {
		this.id = id;
		Type setCt = setType(type);
		this.type = setCt.getValue();
		this.desc = desc;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public static Type setType(String typename) {

		if (typename == null) {
			return null;
		}

		for (Type type : Type.values()) {
			if (typename.equalsIgnoreCase(type.getValue())) {
				return type;
			}
		}
		throw new IllegalArgumentException("Category Type -" + typename + "- invalid ");
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
