package com.sapient.assement.football.api.league;

import java.util.List;

import com.sapient.assement.football.messaging.CountryResponse;
import com.sapient.assement.football.messaging.LeagueResponse;

public interface LeagueService {

	List<LeagueResponse> getAllLeagues();
	
	LeagueResponse getLeagueById(String leagueId);
}
