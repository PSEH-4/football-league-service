package com.sapient.assement.football.api.team;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.assement.football.messaging.CountryResponse;
import com.sapient.assement.football.messaging.LeagueResponse;
import com.sapient.assement.football.messaging.TeamResponse;
import com.sapient.assement.football.util.RestUtil;

@Service
public class TeamServiceImpl implements TeamService {

	@Autowired
	private RestUtil restUtil;

	@Override
	public List<TeamResponse> getAllTeams() {
		return (List<TeamResponse>) restUtil.doGet("get_teams");
	}

	@Override
	public List<TeamResponse> getTeamByLeagueId(String leagueId) {
		Map<String, String> otherArguments = new HashMap<>();
		otherArguments.put("league_id", leagueId);
		return (List<TeamResponse>) restUtil.doGet("get_teams", otherArguments);
	}

}