package com.sapient.assement.football.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.assement.football.api.league.LeagueService;
import com.sapient.assement.football.messaging.LeagueResponse;

@RestController
@RequestMapping("/leagues")
public class LeagueController {

	@Autowired
	private LeagueService leagueService;

	@GetMapping
	public List<LeagueResponse> getAllCountries() {
		List<LeagueResponse> response = leagueService.getAllLeagues();
		if (!CollectionUtils.isEmpty(response)) {
			return response;
		}
		else {
			return new ArrayList<LeagueResponse>();
		}
	}

	@GetMapping("/{league_id}")
	public LeagueResponse getAllLeague(@PathVariable("league_id") String leagueId) {
		return leagueService.getLeagueById(leagueId);
	}
}
