package com.user.app.model.dealers;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AverageStarRating {
	private Float displayStars;
	private Float displayScore;
	private Integer numberOfReviews;

	public AverageStarRating(Float displayStars, Float displayScore, Integer numberOfReviews) {
		super();
		this.displayStars = displayStars;
		this.displayScore = displayScore;
		this.numberOfReviews = numberOfReviews;
	}

	public Float getDisplayStars() {
		return displayStars;
	}

	public void setDisplayStars(Float displayStars) {
		this.displayStars = displayStars;
	}

	public Float getDisplayScore() {
		return displayScore;
	}

	public void setDisplayScore(Float displayScore) {
		this.displayScore = displayScore;
	}

	public Integer getNumberOfReviews() {
		return numberOfReviews;
	}

	public void setNumberOfReviews(Integer numberOfReviews) {
		this.numberOfReviews = numberOfReviews;
	}

	// Constructors, getters, and setters
}