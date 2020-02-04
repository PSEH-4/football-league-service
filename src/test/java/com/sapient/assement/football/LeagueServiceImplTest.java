package com.sapient.assement.football;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Test;
import org.mockito.Mock;

import com.sapient.assement.football.api.league.LeagueService;
import com.sapient.assement.football.messaging.LeagueResponse;

public class LeagueServiceImplTest {

	@Mock
	private LeagueService leagueService;

	@Test
	public void getAllCountriesSuccess() {
		List<LeagueResponse> countries = leagueService.getAllLeaguesByCountry("England");
		assertNotNull(countries);
	}
	
}
