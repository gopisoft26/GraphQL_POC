package com.user.app.model.dealers;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SocialNetwork {
	private String dealerId;
	private String accountId;
	private String network;
	private String networkId;

	public String getDealerId() {
		return dealerId;
	}

	public void setDealerId(String dealerId) {
		this.dealerId = dealerId;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getNetwork() {
		return network;
	}

	public void setNetwork(String network) {
		this.network = network;
	}

	public String getNetworkId() {
		return networkId;
	}

	public void setNetworkId(String networkId) {
		this.networkId = networkId;
	}

	public SocialNetwork(String dealerId, String accountId, String network, String networkId) {
		super();
		this.dealerId = dealerId;
		this.accountId = accountId;
		this.network = network;
		this.networkId = networkId;
	}

	// Constructors, getters, and setters
}