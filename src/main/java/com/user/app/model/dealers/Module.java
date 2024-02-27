package com.user.app.model.dealers;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Module {
	private String dealerId;
	private String name;
	private String moduleId;

	public String getDealerId() {
		return dealerId;
	}

	public void setDealerId(String dealerId) {
		this.dealerId = dealerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModuleId() {
		return moduleId;
	}

	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}

	public Module(String dealerId, String name, String moduleId) {
		super();
		this.dealerId = dealerId;
		this.name = name;
		this.moduleId = moduleId;
	}

	// Constructors, getters, and setters
}