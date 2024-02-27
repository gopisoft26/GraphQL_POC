package com.user.app.model.dealers;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Phone {
	private String identifier;
	private String number;

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Phone(String identifier, String number) {
		super();
		this.identifier = identifier;
		this.number = number;
	}

	// Constructors, getters, and setters
}
