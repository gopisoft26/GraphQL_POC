package com.user.app.model.dealers;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OpeningHours {
	private List<OpeningHoursStructure> regularOpeningHours;
	private List<OpeningHoursStructure> specialOpeningHours;
	private String openingHoursText;
	private String regularOpeningHoursText;
	private String openingHoursText1;
	private String openingHoursText2;

	public List<OpeningHoursStructure> getRegularOpeningHours() {
		return regularOpeningHours;
	}

	public void setRegularOpeningHours(List<OpeningHoursStructure> regularOpeningHours) {
		this.regularOpeningHours = regularOpeningHours;
	}

	public List<OpeningHoursStructure> getSpecialOpeningHours() {
		return specialOpeningHours;
	}

	public void setSpecialOpeningHours(List<OpeningHoursStructure> specialOpeningHours) {
		this.specialOpeningHours = specialOpeningHours;
	}

	public String getOpeningHoursText() {
		return openingHoursText;
	}

	public void setOpeningHoursText(String openingHoursText) {
		this.openingHoursText = openingHoursText;
	}

	public String getRegularOpeningHoursText() {
		return regularOpeningHoursText;
	}

	public void setRegularOpeningHoursText(String regularOpeningHoursText) {
		this.regularOpeningHoursText = regularOpeningHoursText;
	}

	public String getOpeningHoursText1() {
		return openingHoursText1;
	}

	public void setOpeningHoursText1(String openingHoursText1) {
		this.openingHoursText1 = openingHoursText1;
	}

	public String getOpeningHoursText2() {
		return openingHoursText2;
	}

	public void setOpeningHoursText2(String openingHoursText2) {
		this.openingHoursText2 = openingHoursText2;
	}

	public OpeningHours(List<OpeningHoursStructure> regularOpeningHours,
			List<OpeningHoursStructure> specialOpeningHours, String openingHoursText, String regularOpeningHoursText,
			String openingHoursText1, String openingHoursText2) {
		super();
		this.regularOpeningHours = regularOpeningHours;
		this.specialOpeningHours = specialOpeningHours;
		this.openingHoursText = openingHoursText;
		this.regularOpeningHoursText = regularOpeningHoursText;
		this.openingHoursText1 = openingHoursText1;
		this.openingHoursText2 = openingHoursText2;
	}

	// Constructors, getters, and setters
}