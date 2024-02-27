package com.user.app.model.dealers;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StarRating {
	private AverageStarRating sales;
	private AverageStarRating afterSales;

	public AverageStarRating getSales() {
		return sales;
	}

	public void setSales(AverageStarRating sales) {
		this.sales = sales;
	}

	public AverageStarRating getAfterSales() {
		return afterSales;
	}

	public void setAfterSales(AverageStarRating afterSales) {
		this.afterSales = afterSales;
	}

	public StarRating(AverageStarRating sales, AverageStarRating afterSales) {
		super();
		this.sales = sales;
		this.afterSales = afterSales;
	}

	// Constructors, getters, and setters
}
