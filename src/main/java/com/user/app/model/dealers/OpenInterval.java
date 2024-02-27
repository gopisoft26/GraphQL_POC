package com.user.app.model.dealers;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenInterval {
	private String openFrom;
	private String openUntil;

	public String getOpenFrom() {
		return openFrom;
	}

	public void setOpenFrom(String openFrom) {
		this.openFrom = openFrom;
	}

	public String getOpenUntil() {
		return openUntil;
	}

	public void setOpenUntil(String openUntil) {
		this.openUntil = openUntil;
	}

	public OpenInterval(String openFrom, String openUntil) {
		super();
		this.openFrom = openFrom;
		this.openUntil = openUntil;
	}

	// Constructors, getters, and setters
}