package com.sapient.assement.football.api.standing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.assement.football.api.team.TeamService;
import com.sapient.assement.football.messaging.TeamResponse;
import com.sapient.assement.football.messaging.TeamStandingResponse;

@Service
public class TeamStandingServiceImpl implements TeamStandingService {

	@Autowired
	private TeamService teamService;

	@Override
	public List<TeamStandingResponse> getAllTeamStandings() {
		return buildTeamStandingResponse();
	}

	private List<TeamStandingResponse> buildTeamStandingResponse() {
		List<TeamResponse> teams = teamService.getAllTeams();
		List<TeamStandingResponse> teamStandings = new ArrayList<>();
		teams.sort(new TeamComparator());
		
		for (int i = 0; i < teams.size(); i++) {
			teamStandings.add(addTeamStanding(i+1, teams.get(i)));
		}
		return teamStandings;
	}

	private TeamStandingResponse addTeamStanding(int standing, TeamResponse teamResponse) {
		TeamStandingResponse teamStanding = new TeamStandingResponse();
		teamStanding.setStanding(standing);
		teamStanding.setTeam(teamResponse);
		return teamStanding;
	}

}

class TeamComparator implements Comparator<TeamResponse> {

	@Override
	public int compare(TeamResponse team1, TeamResponse team2) {
		return team2.getPoints() - team1.getPoints();
	}
	
}
