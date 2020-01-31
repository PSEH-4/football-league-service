package com.sapient.assement.football.messaging;

public class CountryResponse {

	private String countryId;
	
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
