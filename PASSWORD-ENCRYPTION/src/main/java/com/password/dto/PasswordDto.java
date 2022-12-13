package com.password.dto;

public class PasswordDto {

	private Long id;
	private String fname;
	private String Lname;
	private Long contact;
	private String email;
	private String username;
	private String password;

	public Long getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return Lname;
	}

	public Long getContact() {
		return contact;
	}

	public String getEmail() {
		return email;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	public void setContact(Long contact) {
		this.contact = contact;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
