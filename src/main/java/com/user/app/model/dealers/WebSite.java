package com.user.app.model.dealers;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WebSite {
	private String identifier;
	private String url;
	private String language;

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public WebSite(String identifier, String url, String language) {
		super();
		this.identifier = identifier;
		this.url = url;
		this.language = language;
	}

	// Constructors, getters, and setters
}