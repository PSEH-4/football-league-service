package com.sapient.assement.football.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.assement.football.api.league.LeagueService;
import com.sapient.assement.football.api.standing.TeamStandingService;
import com.sapient.assement.football.api.team.TeamService;
import com.sapient.assement.football.messaging.LeagueResponse;
import com.sapient.assement.football.messaging.TeamResponse;
import com.sapient.assement.football.messaging.TeamStandingResponse;

@RestController
@RequestMapping("/countries/{country_name}/leagues/{league_name}/standings")
public class TeamStandingController {

	@Autowired
	private LeagueService leagueService;

	@Autowired
	private TeamStandingService teamStandingService;

	@GetMapping
	public List<TeamStandingResponse> getAllTeamStandings(@PathVariable("country_name") String countryName, @PathVariable("league_name") String leagueName) {
		List<LeagueResponse> leagues = leagueService.getAllLeaguesByCountry(countryName);
		Optional<LeagueResponse> result = leagues.stream().filter(league -> league.getLeagueName().equals(leagueName)).findAny();
		if (result.isPresent()) {
			String leagueId = result.get().getLeagueId();
			return teamStandingService.getStandingByLeagueId(leagueId);
		}
		return new ArrayList<>();
	}
}
