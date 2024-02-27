package com.user.app.model.dealers;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TestDrive {
	private LateRequest lateRequests;

	public LateRequest getLateRequests() {
		return lateRequests;
	}

	public void setLateRequests(LateRequest lateRequests) {
		this.lateRequests = lateRequests;
	}

	public TestDrive(LateRequest lateRequests) {
		super();
		this.lateRequests = lateRequests;
	}

	// Constructors, getters, and setters
}