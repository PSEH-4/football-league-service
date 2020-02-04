package com.sapient.assement.football.api.standing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.assement.football.api.team.TeamService;
import com.sapient.assement.football.messaging.TeamResponse;
import com.sapient.assement.football.messaging.TeamStandingResponse;
import com.sapient.assement.football.util.RestUtil;

@Service
public class TeamStandingServiceImpl implements TeamStandingService {

	@Autowired
	private RestUtil restUtil;

	@Override
	public List<TeamStandingResponse> getStandingByLeagueId(String leagueId) {
		Map<String, String> otherArguments = new HashMap<>();
		otherArguments.put("league_id", leagueId);
		return (List<TeamStandingResponse>) restUtil.doGet("get_standings", otherArguments);
	}

}

/*class TeamComparator implements Comparator<TeamResponse> {

	@Override
	public int compare(TeamResponse team1, TeamResponse team2) {
		return team2.getPoints() - team1.getPoints();
	}
	
}*/
