package com.sapient.assement.football.messaging;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CoachResponse extends ResponseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8890641172805579202L;

	@JsonProperty("coach_name")
	private String coachName;
	
	@JsonProperty("coach_country")
	private String coachCountry;
	
	@JsonProperty("coach_age")
	private String coachAge;

	public String getCoachName() {
		return coachName;
	}

	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}

	public String getCoachCountry() {
		return coachCountry;
	}

	public void setCoachCountry(String coachCountry) {
		this.coachCountry = coachCountry;
	}

	public String getCoachAge() {
		return coachAge;
	}

	public void setCoachAge(String coachAge) {
		this.coachAge = coachAge;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CoachResponse [coachName=");
		builder.append(coachName);
		builder.append(", coachCountry=");
		builder.append(coachCountry);
		builder.append(", coachAge=");
		builder.append(coachAge);
		builder.append("]");
		return builder.toString();
	}
	
}
