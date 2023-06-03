package com.devb.book_store.entity;

public enum Type {
	ADVENTURE_STORIES(1, "ADVENTURE_STORIES"), 
	CRIME(2, "CRIME"), 
	CLASSICS(3, "CLASSICS"), 
	FANTASY(4, "FANTASY"),
	HORROR(5, "HORROR"), 
	HUMOUR(6, "HUMOUR"), 
	CIENTIFIC(7, "CIENTIF");

	private Integer code;
	private String value;

	private Type(Integer code, String value) {
		this.code = code;
		this.value = value;
	}

	public Integer getCode() {
		return code;
	}

	public String getValue() {
		return value;
	}

}
