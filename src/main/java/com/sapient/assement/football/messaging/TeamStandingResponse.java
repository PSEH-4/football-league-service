package com.sapient.assement.football.messaging;

public class TeamStandingResponse {

	private Integer standing;
	
	private TeamResponse team;

	public Integer getStanding() {
		return standing;
	}

	public void setStanding(Integer standing) {
		this.standing = standing;
	}

	public TeamResponse getTeam() {
		return team;
	}

	public void setTeam(TeamResponse team) {
		this.team = team;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TeamStandingResponse [standing=");
		builder.append(standing);
		builder.append(", team=");
		builder.append(team);
		builder.append("]");
		return builder.toString();
	}
	
}
