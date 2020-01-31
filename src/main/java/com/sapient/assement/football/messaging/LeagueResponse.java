package com.sapient.assement.football.messaging;

public class LeagueResponse {

	private String leagueId;
	
	private String leagueName;

	private String leagueStartDate;

	private String leagueEndDate;

	private CountryResponse leagueHostedIn;

	public String getLeagueId() {
		return leagueId;
	}

	public void setLeagueId(String leagueId) {
		this.leagueId = leagueId;
	}

	public String getLeagueName() {
		return leagueName;
	}

	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}

	public String getLeagueStartDate() {
		return leagueStartDate;
	}

	public void setLeagueStartDate(String leagueStartDate) {
		this.leagueStartDate = leagueStartDate;
	}

	public String getLeagueEndDate() {
		return leagueEndDate;
	}

	public void setLeagueEndDate(String leagueEndDate) {
		this.leagueEndDate = leagueEndDate;
	}

	public CountryResponse getLeagueHostedIn() {
		return leagueHostedIn;
	}

	public void setLeagueHostedIn(CountryResponse leagueHostedIn) {
		this.leagueHostedIn = leagueHostedIn;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LeagueResponse [leagueId=");
		builder.append(leagueId);
		builder.append(", leagueName=");
		builder.append(leagueName);
		builder.append(", leagueStartDate=");
		builder.append(leagueStartDate);
		builder.append(", leagueEndDate=");
		builder.append(leagueEndDate);
		builder.append(", leagueHostedIn=");
		builder.append(leagueHostedIn);
		builder.append("]");
		return builder.toString();
	}
}
