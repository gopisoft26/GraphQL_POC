package com.user.app.model.dealers;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Services {
	private String id;
	private String serviceId;
	private String name;
	private String owner;
	private List<String> brands;
	private String country;
	private String language;
	private String url;
	private OpeningHours openingHours;
	private OpeningHours webCallbackOpeningHours;
	private List<Member> members;
	private List<Phone> phones;
	private List<String> webCallBackPhoneNumbers;
	private String type;
	private String dataClassification;
	private String dealerId;
	private String groupId;
	private String associatedBrand;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public List<String> getBrands() {
		return brands;
	}

	public void setBrands(List<String> brands) {
		this.brands = brands;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public OpeningHours getOpeningHours() {
		return openingHours;
	}

	public void setOpeningHours(OpeningHours openingHours) {
		this.openingHours = openingHours;
	}

	public OpeningHours getWebCallbackOpeningHours() {
		return webCallbackOpeningHours;
	}

	public void setWebCallbackOpeningHours(OpeningHours webCallbackOpeningHours) {
		this.webCallbackOpeningHours = webCallbackOpeningHours;
	}

	public List<Member> getMembers() {
		return members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}

	public List<Phone> getPhones() {
		return phones;
	}

	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}

	public List<String> getWebCallBackPhoneNumbers() {
		return webCallBackPhoneNumbers;
	}

	public void setWebCallBackPhoneNumbers(List<String> webCallBackPhoneNumbers) {
		this.webCallBackPhoneNumbers = webCallBackPhoneNumbers;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDataClassification() {
		return dataClassification;
	}

	public void setDataClassification(String dataClassification) {
		this.dataClassification = dataClassification;
	}

	public String getDealerId() {
		return dealerId;
	}

	public void setDealerId(String dealerId) {
		this.dealerId = dealerId;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getAssociatedBrand() {
		return associatedBrand;
	}

	public void setAssociatedBrand(String associatedBrand) {
		this.associatedBrand = associatedBrand;
	}

	public Services(String id, String serviceId, String name, String owner, List<String> brands, String country,
			String language, String url, OpeningHours openingHours, OpeningHours webCallbackOpeningHours,
			List<Member> members, List<Phone> phones, List<String> webCallBackPhoneNumbers, String type,
			String dataClassification, String dealerId, String groupId, String associatedBrand) {
		super();
		this.id = id;
		this.serviceId = serviceId;
		this.name = name;
		this.owner = owner;
		this.brands = brands;
		this.country = country;
		this.language = language;
		this.url = url;
		this.openingHours = openingHours;
		this.webCallbackOpeningHours = webCallbackOpeningHours;
		this.members = members;
		this.phones = phones;
		this.webCallBackPhoneNumbers = webCallBackPhoneNumbers;
		this.type = type;
		this.dataClassification = dataClassification;
		this.dealerId = dealerId;
		this.groupId = groupId;
		this.associatedBrand = associatedBrand;
	}

	// Constructors, getters, and setters
}