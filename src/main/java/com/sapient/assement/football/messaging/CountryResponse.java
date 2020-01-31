package com.sapient.assement.football.messaging;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CountryResponse extends ResponseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8648502851695486297L;

	@JsonProperty("country_id")
	private String countryId;

	@JsonProperty("country_name")
	private String countryName;

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CountryResponse [countryId=");
		builder.append(countryId);
		builder.append(", countryName=");
		builder.append(countryName);
		builder.append("]");
		return builder.toString();
	}

}
