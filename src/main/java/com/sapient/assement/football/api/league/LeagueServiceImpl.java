package com.sapient.assement.football.api.league;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.assement.football.api.country.CountryService;
import com.sapient.assement.football.messaging.CountryResponse;
import com.sapient.assement.football.messaging.LeagueResponse;
import com.sapient.assement.football.util.RestUtil;

@Service
public class LeagueServiceImpl implements LeagueService {

	@Autowired
	private CountryService countryService;

	@Autowired
	private RestUtil restUtil;

	@Override
	public List<LeagueResponse> getAllLeaguesByCountry(String countryName) {
		CountryResponse country = countryService.getCountryByName(countryName);
		Map<String, String> otherArguments = new HashMap<>();
		otherArguments.put("country_id", country.getCountryId());
		return (List<LeagueResponse>) restUtil.doGet("get_leagues", otherArguments);
	}
	
}
