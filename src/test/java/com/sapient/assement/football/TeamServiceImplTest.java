package com.sapient.assement.football;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Test;
import org.mockito.Mock;

import com.sapient.assement.football.api.team.TeamService;
import com.sapient.assement.football.messaging.TeamResponse;

public class TeamServiceImplTest {

	@Mock
	private TeamService teamService;

	@Test
	public void getAllCountriesSuccess() {
		List<TeamResponse> countries = teamService.getAllTeams();
		assertNotNull(countries);
	}

	
}
