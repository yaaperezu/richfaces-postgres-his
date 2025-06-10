package com.test.his.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class User extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Column(nullable = false)
	private String firstname;

	@Column(nullable = false)
	private String surname;

	@Column(nullable = false, unique = true)
	private String username;

	@Column(nullable = false)
	private String password;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
