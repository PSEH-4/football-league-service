package com.sapient.assement.football.messaging;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TeamResponse extends ResponseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3746499358669749935L;

	@JsonProperty("team_key")
	private String teamId;

	@JsonProperty("team_name")
	private String teamName;

	@JsonProperty("team_badge")
	private String teamBadge;
	
	private List<PlayerResponse> players;
	
	private List<CoachResponse> coaches;

	public String getTeamId() {
		return teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamBadge() {
		return teamBadge;
	}

	public void setTeamBadge(String teamBadge) {
		this.teamBadge = teamBadge;
	}

	public List<PlayerResponse> getPlayers() {
		return players;
	}

	public void setPlayers(List<PlayerResponse> players) {
		this.players = players;
	}

	public List<CoachResponse> getCoaches() {
		return coaches;
	}

	public void setCoaches(List<CoachResponse> coaches) {
		this.coaches = coaches;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TeamResponse [teamId=");
		builder.append(teamId);
		builder.append(", teamName=");
		builder.append(teamName);
		builder.append(", teamBadge=");
		builder.append(teamBadge);
		builder.append(", players=");
		builder.append(players);
		builder.append(", coaches=");
		builder.append(coaches);
		builder.append("]");
		return builder.toString();
	}
	
	
}
