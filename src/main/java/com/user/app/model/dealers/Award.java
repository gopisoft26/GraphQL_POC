package com.user.app.model.dealers;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Award {
	private String id;
	private String strid;
	private Image picture;
	private String title;
	private String description;

	public Award(String id, String strid, Image picture, String title, String description) {
		super();
		this.id = id;
		this.strid = strid;
		this.picture = picture;
		this.title = title;
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStrid() {
		return strid;
	}

	public void setStrid(String strid) {
		this.strid = strid;
	}

	public Image getPicture() {
		return picture;
	}

	public void setPicture(Image picture) {
		this.picture = picture;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	// Constructors, getters, and setters
}