package com.user.app.model.dealers;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Image {
	private String url;
	private String desktopStandard;
	private String desktopRetina;
	private String mobileStandard;
	private String mobileRetina;
	private String tabletStandard;
	private String tabletRetina;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDesktopStandard() {
		return desktopStandard;
	}

	public void setDesktopStandard(String desktopStandard) {
		this.desktopStandard = desktopStandard;
	}

	public String getDesktopRetina() {
		return desktopRetina;
	}

	public void setDesktopRetina(String desktopRetina) {
		this.desktopRetina = desktopRetina;
	}

	public String getMobileStandard() {
		return mobileStandard;
	}

	public void setMobileStandard(String mobileStandard) {
		this.mobileStandard = mobileStandard;
	}

	public String getMobileRetina() {
		return mobileRetina;
	}

	public void setMobileRetina(String mobileRetina) {
		this.mobileRetina = mobileRetina;
	}

	public String getTabletStandard() {
		return tabletStandard;
	}

	public void setTabletStandard(String tabletStandard) {
		this.tabletStandard = tabletStandard;
	}

	public String getTabletRetina() {
		return tabletRetina;
	}

	public void setTabletRetina(String tabletRetina) {
		this.tabletRetina = tabletRetina;
	}

	public Image(String url, String desktopStandard, String desktopRetina, String mobileStandard, String mobileRetina,
			String tabletStandard, String tabletRetina) {
		super();
		this.url = url;
		this.desktopStandard = desktopStandard;
		this.desktopRetina = desktopRetina;
		this.mobileStandard = mobileStandard;
		this.mobileRetina = mobileRetina;
		this.tabletStandard = tabletStandard;
		this.tabletRetina = tabletRetina;
	}

	// Constructors, getters, and setters
}