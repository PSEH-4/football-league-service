package com.sapient.assement.football.api.standing;

import java.util.List;

import com.sapient.assement.football.messaging.TeamStandingResponse;

public interface TeamStandingService {

	List<TeamStandingResponse> getAllTeamStandings();
}
