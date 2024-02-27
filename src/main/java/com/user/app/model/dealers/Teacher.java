package com.user.app.model.dealers;

public class Teacher implements Person {

	private String id;
	private String firstName;
	private String lastName;
	private String subject;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Teacher(String id, String firstName, String lastName, String subject) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.subject = subject;
	}

	public Teacher() {
		// TODO Auto-generated constructor stub
	}
}
