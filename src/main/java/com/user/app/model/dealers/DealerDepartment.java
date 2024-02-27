package com.user.app.model.dealers;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.user.app.model.dealer.Address;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DealerDepartment {
	private String dealerId;
	private String language;
	private String id;
	private String name;
	private String defaultDepartment;
	private Coordinates geolocation;
	private Address address;
	private Contact contact;
	private OpeningHours openingHours;

	public String getDealerId() {
		return dealerId;
	}

	public void setDealerId(String dealerId) {
		this.dealerId = dealerId;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDefaultDepartment() {
		return defaultDepartment;
	}

	public void setDefaultDepartment(String defaultDepartment) {
		this.defaultDepartment = defaultDepartment;
	}

	public Coordinates getGeolocation() {
		return geolocation;
	}

	public void setGeolocation(Coordinates geolocation) {
		this.geolocation = geolocation;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public OpeningHours getOpeningHours() {
		return openingHours;
	}

	public void setOpeningHours(OpeningHours openingHours) {
		this.openingHours = openingHours;
	}

	public DealerDepartment(String dealerId, String language, String id, String name, String defaultDepartment,
			Coordinates geolocation, Address address, Contact contact, OpeningHours openingHours) {
		super();
		this.dealerId = dealerId;
		this.language = language;
		this.id = id;
		this.name = name;
		this.defaultDepartment = defaultDepartment;
		this.geolocation = geolocation;
		this.address = address;
		this.contact = contact;
		this.openingHours = openingHours;
	}

	// Constructors, getters, and setters
}