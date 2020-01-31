package com.sapient.assement.football.api.team;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sapient.assement.football.messaging.TeamResponse;

@Service
public class TeamServiceImpl implements TeamService {

	@Override
	public List<TeamResponse> getAllTeams() {
		return buildTeamResponse();
	}

	@Override
	public TeamResponse getTeamById(String teamId) {
		List<TeamResponse> teams = buildTeamResponse();
		Optional<TeamResponse> result = teams.stream().filter(team -> team.getTeamId().equals(teamId)).findAny();
		if (result.isPresent()) {
			return result.get();
		}
		else {
			return null;
		}
	}

	private List<TeamResponse> buildTeamResponse() {
		List<TeamResponse> countries = new ArrayList<>();
		countries.add(addTeam("TM000001", "Liverpool F.C.", 25));
		countries.add(addTeam("TM000002", "Manchester City F.C.", 30));
		countries.add(addTeam("TM000003", "Arsenal F.C.", 27));
		countries.add(addTeam("TM000004", "Manchester United F.C.", 35));
		countries.add(addTeam("TM000005", "Chelsea F.C.", 26));
		countries.add(addTeam("TM000006", "Everton F.C.", 20));
		countries.add(addTeam("TM000007", "Southampton F.C.", 22));
		countries.add(addTeam("TM000008", "Aston Villa F.C.", 27));
		countries.add(addTeam("TM000009", "West Ham United F.C.", 21));
		countries.add(addTeam("TM000010", "Burnely F.C.", 23));
		return countries;
	}

	private TeamResponse addTeam(String teamId, String teamName, Integer points) {
		TeamResponse team = new TeamResponse();
		team.setTeamId(teamId);
		team.setTeamName(teamName);
		team.setPoints(points);
		return team;
	}
}
