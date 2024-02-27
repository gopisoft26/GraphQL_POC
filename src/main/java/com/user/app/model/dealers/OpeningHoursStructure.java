package com.user.app.model.dealers;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OpeningHoursStructure {
	private String dealerId;
	private String siteId;
	private String serviceId;
	private String activityId;
	private String openingHourId;
	private Boolean closed;
	private Integer weekDay;
	private List<OpenInterval> openIntervals;
	private String departmentId;

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

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getOpeningHourId() {
		return openingHourId;
	}

	public void setOpeningHourId(String openingHourId) {
		this.openingHourId = openingHourId;
	}

	public Boolean getClosed() {
		return closed;
	}

	public void setClosed(Boolean closed) {
		this.closed = closed;
	}

	public Integer getWeekDay() {
		return weekDay;
	}

	public void setWeekDay(Integer weekDay) {
		this.weekDay = weekDay;
	}

	public List<OpenInterval> getOpenIntervals() {
		return openIntervals;
	}

	public void setOpenIntervals(List<OpenInterval> openIntervals) {
		this.openIntervals = openIntervals;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public OpeningHoursStructure(String dealerId, String siteId, String serviceId, String activityId,
			String openingHourId, Boolean closed, Integer weekDay, List<OpenInterval> openIntervals,
			String departmentId) {
		super();
		this.dealerId = dealerId;
		this.siteId = siteId;
		this.serviceId = serviceId;
		this.activityId = activityId;
		this.openingHourId = openingHourId;
		this.closed = closed;
		this.weekDay = weekDay;
		this.openIntervals = openIntervals;
		this.departmentId = departmentId;
	}

	// Constructors, getters, and setters
}