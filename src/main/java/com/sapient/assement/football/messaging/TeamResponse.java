package com.sapient.assement.football.messaging;

public class TeamResponse {

	private String teamId;
	
	private String teamName;

	private Integer points;

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

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TeamResponse [teamId=");
		builder.append(teamId);
		builder.append(", teamName=");
		builder.append(teamName);
		builder.append(", points=");
		builder.append(points);
		builder.append("]");
		return builder.toString();
	}
	
}
