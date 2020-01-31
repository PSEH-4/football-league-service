package com.sapient.assement.football.api.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.assement.football.api.country.CountryService;
import com.sapient.assement.football.api.league.LeagueService;
import com.sapient.assement.football.api.team.TeamService;
import com.sapient.assement.football.messaging.ResponseModel;

@Service
public class ActionServiceImpl implements ActionService {

	@Autowired
	private CountryService countryService;

	@Autowired
	private LeagueService leagueService;

	@Autowired
	private TeamService teamService;

	@Override
	public List<? extends ResponseModel> getAction(String action) {
		if ("get_countries".equals(action)) {
			return countryService.getAllCountries();
		}
		else if ("get_leagues".equals(action)) {
			return leagueService.getAllLeagues();
		}
		else if ("get_teams".equals(action)) {
			return teamService.getAllTeams();
		}
		return null;
	}

}
