package com.sapient.assement.football.api.team;

import java.util.List;

import com.sapient.assement.football.messaging.TeamResponse;

public interface TeamService {

	List<TeamResponse> getAllTeams();
	
	List<TeamResponse> getTeamByLeagueId(String leagueId);
}
