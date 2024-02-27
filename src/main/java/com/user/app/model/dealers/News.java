package com.user.app.model.dealers;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class News {
	private String dealerId;
	private String groupId;
	private String language;
	private String newsType;
	private String updateDateString;
	private String onTitle;
	private String title;
	private String body;
	//private List<Image> picture;

	public String getDealerId() {
		return dealerId;
	}

	public void setDealerId(String dealerId) {
		this.dealerId = dealerId;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getNewsType() {
		return newsType;
	}

	public void setNewsType(String newsType) {
		this.newsType = newsType;
	}

	public String getUpdateDateString() {
		return updateDateString;
	}

	public void setUpdateDateString(String updateDateString) {
		this.updateDateString = updateDateString;
	}

	public String getOnTitle() {
		return onTitle;
	}

	public void setOnTitle(String onTitle) {
		this.onTitle = onTitle;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

}