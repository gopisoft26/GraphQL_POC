package com.user.app.model.dealer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Address {
	private String addressLine1;
	private String addressLine2;
	private String addressLine3;
	private String postalCode;
	private String city;
	private String state;
	private String stateCode;
	private String regionExternalCode;
	private String districtExternStringode;
	private String area;
	private String zipCode3Digits;
	private String zipCode4Digits;

	public Address(String addressLine1, String addressLine2, String addressLine3, String postalCode, String city,
			String state, String stateCode, String regionExternalCode, String districtExternStringode, String area,
			String zipCode3Digits, String zipCode4Digits) {
		super();
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.addressLine3 = addressLine3;
		this.postalCode = postalCode;
		this.city = city;
		this.state = state;
		this.stateCode = stateCode;
		this.regionExternalCode = regionExternalCode;
		this.districtExternStringode = districtExternStringode;
		this.area = area;
		this.zipCode3Digits = zipCode3Digits;
		this.zipCode4Digits = zipCode4Digits;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getAddressLine3() {
		return addressLine3;
	}

	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getRegionExternalCode() {
		return regionExternalCode;
	}

	public void setRegionExternalCode(String regionExternalCode) {
		this.regionExternalCode = regionExternalCode;
	}

	public String getDistrictExternStringode() {
		return districtExternStringode;
	}

	public void setDistrictExternStringode(String districtExternStringode) {
		this.districtExternStringode = districtExternStringode;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getZipCode3Digits() {
		return zipCode3Digits;
	}

	public void setZipCode3Digits(String zipCode3Digits) {
		this.zipCode3Digits = zipCode3Digits;
	}

	public String getZipCode4Digits() {
		return zipCode4Digits;
	}

	public void setZipCode4Digits(String zipCode4Digits) {
		this.zipCode4Digits = zipCode4Digits;
	}

	// Constructors, getters, and setters
}