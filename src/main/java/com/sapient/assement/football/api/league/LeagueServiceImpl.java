package com.sapient.assement.football.api.league;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sapient.assement.football.messaging.LeagueResponse;

@Service
public class LeagueServiceImpl implements LeagueService {

	@Override
	public List<LeagueResponse> getAllLeagues() {
		return buildLeagueResponse();
	}

	@Override
	public LeagueResponse getLeagueById(String leagueId) {
		List<LeagueResponse> leagues = buildLeagueResponse();
		Optional<LeagueResponse> result = leagues.stream().filter(league -> league.getLeagueId().equals(leagueId)).findAny();
		if (result.isPresent()) {
			return result.get();
		}
		else {
			return null;
		}
	}

	private List<LeagueResponse> buildLeagueResponse() {
		List<LeagueResponse> leagues = new ArrayList<>();
		leagues.add(addLeague("LG000001", "FIFA"));
		leagues.add(addLeague("LG000002", "EFL"));
		leagues.add(addLeague("LG000003", "UEFA Europa League"));
		leagues.add(addLeague("LG000004", "UEFA Champions League"));
		leagues.add(addLeague("LG000005", "Serie A"));
		leagues.add(addLeague("LG000006", "FA Cup"));
		leagues.add(addLeague("LG000007", "La Liga"));
		leagues.add(addLeague("LG000008", "ISL"));
		leagues.add(addLeague("LG000009", "AFC Cup"));
		leagues.add(addLeague("LG000010", "NFL"));
		return leagues;
	}

	private LeagueResponse addLeague(String leagueId, String leagueName) {
		LeagueResponse league = new LeagueResponse();
		league.setLeagueId(leagueId);
		league.setLeagueName(leagueName);
		return league;
	}
}
