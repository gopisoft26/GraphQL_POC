package com.user.app.model.dealers;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.user.app.model.dealer.Address;

@Document("dealers_v2")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Dealer {
	private String id;
	private String dealerId;
	private String siteId;
	private String owner;
	private List<String> brands;
	private String country;
	private String language;
	private String openingHoursUrl;
	private String name;
	private Address address;
	private Coordinates geolocation;
	private OpeningHours openingHours;
	private Contact contact;
	private List<String> mailtoEmails;
	private Manager manager;
	private List<Services> services;
	private StarRating averageStarRating;
	private Boolean canAcceptLeads;
	private Boolean canAcceptGeneralDemand;
	private Boolean hasDealerWebsite;
	private String type;
	private List<String> affiliates;
	private Group group;
	private String shortName;
	private String marketingGroupId;
	// private Contract feedContracts;
	private String updateCode;
	private String flowDealerType;
	private Boolean invalidDealerType;
	private Boolean active;
	private Boolean blacklisted;
	private String urlId;
	private Image logo;
	private Image backgroundPicture;
	private List<String> spokenLanguages;
	private String description;

	private List<SocialNetwork> socialNetworks;
	private List<Award> awards;
	private List<Certification> certifications;
	private List<News> news;
	private List<Module> modules;
	// private List<Commitment> commitments;
	private String lowestSite;
	private Image linkToRentVehicle;
	private TestDrive testDrive;
	private List<DealerDepartment> departments;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDealerId() {
		return dealerId;
	}

	public void setDealerId(String dealerId) {
		this.dealerId = dealerId;
	}

	public String getSiteId() {
		return siteId;
	}

	public void setSiteId(String siteId) {
		this.siteId = siteId;
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

	public String getOpeningHoursUrl() {
		return openingHoursUrl;
	}

	public void setOpeningHoursUrl(String openingHoursUrl) {
		this.openingHoursUrl = openingHoursUrl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getMailtoEmails() {
		return mailtoEmails;
	}

	public void setMailtoEmails(List<String> mailtoEmails) {
		this.mailtoEmails = mailtoEmails;
	}

	public StarRating getAverageStarRating() {
		return averageStarRating;
	}

	public void setAverageStarRating(StarRating averageStarRating) {
		this.averageStarRating = averageStarRating;
	}

	public Boolean getCanAcceptLeads() {
		return canAcceptLeads;
	}

	public void setCanAcceptLeads(Boolean canAcceptLeads) {
		this.canAcceptLeads = canAcceptLeads;
	}

	public Boolean getCanAcceptGeneralDemand() {
		return canAcceptGeneralDemand;
	}

	public void setCanAcceptGeneralDemand(Boolean canAcceptGeneralDemand) {
		this.canAcceptGeneralDemand = canAcceptGeneralDemand;
	}

	public Boolean getHasDealerWebsite() {
		return hasDealerWebsite;
	}

	public void setHasDealerWebsite(Boolean hasDealerWebsite) {
		this.hasDealerWebsite = hasDealerWebsite;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<String> getAffiliates() {
		return affiliates;
	}

	public void setAffiliates(List<String> affiliates) {
		this.affiliates = affiliates;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getMarketingGroupId() {
		return marketingGroupId;
	}

	public void setMarketingGroupId(String marketingGroupId) {
		this.marketingGroupId = marketingGroupId;
	}

	public String getUpdateCode() {
		return updateCode;
	}

	public void setUpdateCode(String updateCode) {
		this.updateCode = updateCode;
	}

	public String getFlowDealerType() {
		return flowDealerType;
	}

	public void setFlowDealerType(String flowDealerType) {
		this.flowDealerType = flowDealerType;
	}

	public Boolean getInvalidDealerType() {
		return invalidDealerType;
	}

	public void setInvalidDealerType(Boolean invalidDealerType) {
		this.invalidDealerType = invalidDealerType;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Boolean getBlacklisted() {
		return blacklisted;
	}

	public void setBlacklisted(Boolean blacklisted) {
		this.blacklisted = blacklisted;
	}

	public String getUrlId() {
		return urlId;
	}

	public void setUrlId(String urlId) {
		this.urlId = urlId;
	}

	public List<String> getSpokenLanguages() {
		return spokenLanguages;
	}

	public void setSpokenLanguages(List<String> spokenLanguages) {
		this.spokenLanguages = spokenLanguages;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLowestSite() {
		return lowestSite;
	}

	public void setLowestSite(String lowestSite) {
		this.lowestSite = lowestSite;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Coordinates getGeolocation() {
		return geolocation;
	}

	public void setGeolocation(Coordinates geolocation) {
		this.geolocation = geolocation;
	}

	public OpeningHours getOpeningHours() {
		return openingHours;
	}

	public void setOpeningHours(OpeningHours openingHours) {
		this.openingHours = openingHours;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public List<Services> getServices() {
		return services;
	}

	public void setServices(List<Services> services) {
		this.services = services;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public Image getLogo() {
		return logo;
	}

	public void setLogo(Image logo) {
		this.logo = logo;
	}

	public Image getBackgroundPicture() {
		return backgroundPicture;
	}

	public void setBackgroundPicture(Image backgroundPicture) {
		this.backgroundPicture = backgroundPicture;
	}

	public List<SocialNetwork> getSocialNetworks() {
		return socialNetworks;
	}

	public void setSocialNetworks(List<SocialNetwork> socialNetworks) {
		this.socialNetworks = socialNetworks;
	}

	public List<Award> getAwards() {
		return awards;
	}

	public void setAwards(List<Award> awards) {
		this.awards = awards;
	}

	public List<Certification> getCertifications() {
		return certifications;
	}

	public void setCertifications(List<Certification> certifications) {
		this.certifications = certifications;
	}

	public List<Module> getModules() {
		return modules;
	}

	public void setModules(List<Module> modules) {
		this.modules = modules;
	}

	public Image getLinkToRentVehicle() {
		return linkToRentVehicle;
	}

	public void setLinkToRentVehicle(Image linkToRentVehicle) {
		this.linkToRentVehicle = linkToRentVehicle;
	}

	public TestDrive getTestDrive() {
		return testDrive;
	}

	public void setTestDrive(TestDrive testDrive) {
		this.testDrive = testDrive;
	}

	public List<DealerDepartment> getDepartments() {
		return departments;
	}

	public void setDepartments(List<DealerDepartment> departments) {
		this.departments = departments;
	}

	public List<News> getNews() {
		return news;
	}

	public void setNews(List<News> news) {
		this.news = news;
	}

	public Dealer(List<News> news) {
		super();
		this.news = news;
	}

}
