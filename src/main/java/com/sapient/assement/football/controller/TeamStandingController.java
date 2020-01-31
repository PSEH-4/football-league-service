package com.sapient.assement.football.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.assement.football.api.standing.TeamStandingService;
import com.sapient.assement.football.api.team.TeamService;
import com.sapient.assement.football.messaging.TeamResponse;
import com.sapient.assement.football.messaging.TeamStandingResponse;

@RestController
@RequestMapping("/team-standings")
public class TeamStandingController {

	@Autowired
	private TeamStandingService teamStandingService;

	@GetMapping
	public List<TeamStandingResponse> getAllTeamStandings() {
		List<TeamStandingResponse> response = teamStandingService.getAllTeamStandings();
		if (!CollectionUtils.isEmpty(response)) {
			return response;
		}
		else {
			return new ArrayList<TeamStandingResponse>();
		}
	}
}
