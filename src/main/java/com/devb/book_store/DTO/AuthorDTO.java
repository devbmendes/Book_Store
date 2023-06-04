package com.devb.book_store.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

public class AuthorDTO {

	@NotEmpty(message="First Name field is required")
	@NotBlank
	private String firstname;
	@NotEmpty(message="Last Name field is required")
	@NotBlank
	private String lastname;
	@Email(message = "Insert a valid email")
	@NotEmpty
	@NotBlank
	private String email;

	public AuthorDTO() {

	}

	public AuthorDTO(String firstname, String lastname, String email) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
