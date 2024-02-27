package com.user.app.model.dealers;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Manager {
	private String lastName;
	private String firstName;
	private String role;
	private Image picture;
	private String message;

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Image getPicture() {
		return picture;
	}

	public void setPicture(Image picture) {
		this.picture = picture;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Manager(String lastName, String firstName, String role, Image picture, String message) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.role = role;
		this.picture = picture;
		this.message = message;
	}

	// Constructors, getters, and setters
}