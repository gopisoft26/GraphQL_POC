package com.user.app.model.dealers;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Contact {
	private String phone;
	private String fax;
	private String email;
	private String website;
	private List<Phone> phones;
	private List<WebSite> websites;

	public Contact(String phone, String fax, String email, String website, List<Phone> phones, List<WebSite> websites) {
		super();
		this.phone = phone;
		this.fax = fax;
		this.email = email;
		this.website = website;
		this.phones = phones;
		this.websites = websites;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public List<Phone> getPhones() {
		return phones;
	}

	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}

	public List<WebSite> getWebsites() {
		return websites;
	}

	public void setWebsites(List<WebSite> websites) {
		this.websites = websites;
	}

	// Constructors, getters, and setters
}