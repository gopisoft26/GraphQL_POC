package com.user.app.model.dealers;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Commitment {
	private List<Image> picture;
	private String title;
	private String body;

	public List<Image> getPicture() {
		return picture;
	}

	public void setPicture(List<Image> picture) {
		this.picture = picture;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Commitment(List<Image> picture, String title, String body) {
		super();
		this.picture = picture;
		this.title = title;
		this.body = body;
	}

	// Constructors, getters, and setters
}