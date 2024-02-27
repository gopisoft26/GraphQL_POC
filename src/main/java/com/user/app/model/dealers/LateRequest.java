package com.user.app.model.dealers;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LateRequest {
	private Boolean available;
	private String cutOffTime;
	private Integer cutOffDaysInAdvance;

	public Boolean getAvailable() {
		return available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}

	public String getCutOffTime() {
		return cutOffTime;
	}

	public void setCutOffTime(String cutOffTime) {
		this.cutOffTime = cutOffTime;
	}

	public Integer getCutOffDaysInAdvance() {
		return cutOffDaysInAdvance;
	}

	public void setCutOffDaysInAdvance(Integer cutOffDaysInAdvance) {
		this.cutOffDaysInAdvance = cutOffDaysInAdvance;
	}

	public LateRequest(Boolean available, String cutOffTime, Integer cutOffDaysInAdvance) {
		super();
		this.available = available;
		this.cutOffTime = cutOffTime;
		this.cutOffDaysInAdvance = cutOffDaysInAdvance;
	}

	// Constructors, getters, and setters
}
