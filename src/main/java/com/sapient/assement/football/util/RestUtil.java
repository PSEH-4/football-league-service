package com.sapient.assement.football.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.sapient.assement.football.messaging.CountryResponse;
import com.sapient.assement.football.messaging.LeagueResponse;
import com.sapient.assement.football.messaging.ResponseModel;
import com.sapient.assement.football.messaging.TeamResponse;
import com.sapient.assement.football.messaging.TeamStandingResponse;

@Component
public class RestUtil {

	@Autowired
	RestTemplate restTemplate;

	@Value("${base.url}")
	private String baseUrl;

	@Value("${api.key}")
	private String apiKey;

	public List<? extends ResponseModel> doGet(String action) {
		return doGet(action, null);
	}

	public List<? extends ResponseModel> doGet(String action, Map<String, String> otherArgumements) {
		StringBuilder urlBuilder = new StringBuilder(baseUrl);
		urlBuilder.append("APIkey=");
		urlBuilder.append(apiKey);
		urlBuilder.append("&action=");
		urlBuilder.append(action);
		if (otherArgumements != null) {
			Set<String> otherArgumentKeys = otherArgumements.keySet();
			for (String otherArgumentKey : otherArgumentKeys) {
				urlBuilder.append("&");
				urlBuilder.append(otherArgumentKey);
				urlBuilder.append("=");
				urlBuilder.append(otherArgumements.get(otherArgumentKey));
			}
		}

		if (action.equals("get_countries")) {
			return restTemplate.exchange(urlBuilder.toString(),
					HttpMethod.GET, null, new ParameterizedTypeReference<List<CountryResponse>>() {
					}).getBody();
		}
		else if (action.equals("get_leagues")){
			return restTemplate.exchange(urlBuilder.toString(),
					HttpMethod.GET, null, new ParameterizedTypeReference<List<LeagueResponse>>() {
					}).getBody();
		}
		else if (action.equals("get_teams")){
			return restTemplate.exchange(urlBuilder.toString(),
					HttpMethod.GET, null, new ParameterizedTypeReference<List<TeamResponse>>() {
					}).getBody();
		}
		else if (action.equals("get_standings")){
			return restTemplate.exchange(urlBuilder.toString(),
					HttpMethod.GET, null, new ParameterizedTypeReference<List<TeamStandingResponse>>() {
					}).getBody();
		}
		return new ArrayList<ResponseModel>();
	}
}
