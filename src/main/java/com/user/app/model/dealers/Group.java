package com.user.app.model.dealers;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.user.app.model.dealer.Address;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Group {
	private String _id;
	private String groupId;
	private String language;
	private String country;
	private String owner;
	private String shortName;
	private List<String> brands;
	private String urlId;
	private String name;
	private Address address;
	private Contact contact;
	private Image logo;
	private Image picture;
	private String description;
//	private None dealers; // You might need to define a 'None' public class
	private List<News> news;
	private String title;
	private List<Commitment> commitments;
	private String dealerId;
	private List<WebSite> websites;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public List<String> getBrands() {
		return brands;
	}

	public void setBrands(List<String> brands) {
		this.brands = brands;
	}

	public String getUrlId() {
		return urlId;
	}

	public void setUrlId(String urlId) {
		this.urlId = urlId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Image getLogo() {
		return logo;
	}

	public void setLogo(Image logo) {
		this.logo = logo;
	}

	public Image getPicture() {
		return picture;
	}

	public void setPicture(Image picture) {
		this.picture = picture;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<News> getNews() {
		return news;
	}

	public void setNews(List<News> news) {
		this.news = news;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Commitment> getCommitments() {
		return commitments;
	}

	public void setCommitments(List<Commitment> commitments) {
		this.commitments = commitments;
	}

	public String getDealerId() {
		return dealerId;
	}

	public void setDealerId(String dealerId) {
		this.dealerId = dealerId;
	}

	public List<WebSite> getWebsites() {
		return websites;
	}

	public void setWebsites(List<WebSite> websites) {
		this.websites = websites;
	}

	public Group(String _id, String groupId, String language, String country, String owner, String shortName,
			List<String> brands, String urlId, String name, Address address, Contact contact, Image logo, Image picture,
			String description, List<News> news, String title, List<Commitment> commitments, String dealerId,
			List<WebSite> websites) {
		super();
		this._id = _id;
		this.groupId = groupId;
		this.language = language;
		this.country = country;
		this.owner = owner;
		this.shortName = shortName;
		this.brands = brands;
		this.urlId = urlId;
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.logo = logo;
		this.picture = picture;
		this.description = description;
		this.news = news;
		this.title = title;
		this.commitments = commitments;
		this.dealerId = dealerId;
		this.websites = websites;
	}

	// Constructors, getters, and setters
}