package com.user.app.model.dealers;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Contract {
	private String _id;
	private List<String> affiliates;
	private String contractId;
	private String dealerId;
	private String startDate;
	private String endDate;
	private String status;
	private String contractor;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public List<String> getAffiliates() {
		return affiliates;
	}

	public void setAffiliates(List<String> affiliates) {
		this.affiliates = affiliates;
	}

	public String getContractId() {
		return contractId;
	}

	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	public String getDealerId() {
		return dealerId;
	}

	public void setDealerId(String dealerId) {
		this.dealerId = dealerId;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getContractor() {
		return contractor;
	}

	public void setContractor(String contractor) {
		this.contractor = contractor;
	}

	public Contract(String _id, List<String> affiliates, String contractId, String dealerId, String startDate,
			String endDate, String status, String contractor) {
		super();
		this._id = _id;
		this.affiliates = affiliates;
		this.contractId = contractId;
		this.dealerId = dealerId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.status = status;
		this.contractor = contractor;
	}

	// Constructors, getters, and setters
}
