package com.sapient.assement.football.messaging;

import java.util.Date;

public class MatchResponse {

	private String matchId;

	private Date matchDate;
	
	private String matchStatus;
	
	private String team1Name;
	
	private String team2Name;
	
	private Integer team1Goals;
	
	private Integer team2Goals;
	
	private String matchResult;
	
	private String matchWinnerTeam;

	private String matchRunnerTeam;

	public String getMatchId() {
		return matchId;
	}

	public void setMatchId(String matchId) {
		this.matchId = matchId;
	}

	public Date getMatchDate() {
		return matchDate;
	}

	public void setMatchDate(Date matchDate) {
		this.matchDate = matchDate;
	}

	public String getMatchStatus() {
		return matchStatus;
	}

	public void setMatchStatus(String matchStatus) {
		this.matchStatus = matchStatus;
	}

	public String getTeam1Name() {
		return team1Name;
	}

	public void setTeam1Name(String team1Name) {
		this.team1Name = team1Name;
	}

	public String getTeam2Name() {
		return team2Name;
	}

	public void setTeam2Name(String team2Name) {
		this.team2Name = team2Name;
	}

	public Integer getTeam1Goals() {
		return team1Goals;
	}

	public void setTeam1Goals(Integer team1Goals) {
		this.team1Goals = team1Goals;
	}

	public Integer getTeam2Goals() {
		return team2Goals;
	}

	public void setTeam2Goals(Integer team2Goals) {
		this.team2Goals = team2Goals;
	}

	public String getMatchResult() {
		return matchResult;
	}

	public void setMatchResult(String matchResult) {
		this.matchResult = matchResult;
	}

	public String getMatchWinnerTeam() {
		return matchWinnerTeam;
	}

	public void setMatchWinnerTeam(String matchWinnerTeam) {
		this.matchWinnerTeam = matchWinnerTeam;
	}

	public String getMatchRunnerTeam() {
		return matchRunnerTeam;
	}

	public void setMatchRunnerTeam(String matchRunnerTeam) {
		this.matchRunnerTeam = matchRunnerTeam;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MatchResponse [matchId=");
		builder.append(matchId);
		builder.append(", matchDate=");
		builder.append(matchDate);
		builder.append(", matchStatus=");
		builder.append(matchStatus);
		builder.append(", team1Name=");
		builder.append(team1Name);
		builder.append(", team2Name=");
		builder.append(team2Name);
		builder.append(", team1Goals=");
		builder.append(team1Goals);
		builder.append(", team2Goals=");
		builder.append(team2Goals);
		builder.append(", matchResult=");
		builder.append(matchResult);
		builder.append(", matchWinnerTeam=");
		builder.append(matchWinnerTeam);
		builder.append(", matchRunnerTeam=");
		builder.append(matchRunnerTeam);
		builder.append("]");
		return builder.toString();
	}

}
