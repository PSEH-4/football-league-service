package com.sapient.assement.football.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.assement.football.api.team.TeamService;
import com.sapient.assement.football.messaging.TeamResponse;

@RestController
@RequestMapping("/teams")
public class TeamController {

	@Autowired
	private TeamService teamService;

	@GetMapping
	public List<TeamResponse> getAllCountries() {
		List<TeamResponse> response = teamService.getAllTeams();
		if (!CollectionUtils.isEmpty(response)) {
			return response;
		}
		else {
			return new ArrayList<TeamResponse>();
		}
	}

	@GetMapping("/{team_id}")
	public TeamResponse getAllTeam(@PathVariable("team_id") String teamId) {
		return teamService.getTeamById(teamId);
	}
}
