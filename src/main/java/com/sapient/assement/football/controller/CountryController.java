package com.sapient.assement.football.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.assement.football.api.country.CountryService;
import com.sapient.assement.football.messaging.CountryResponse;

@RestController
@RequestMapping("/countries")
public class CountryController {

	@Autowired
	private CountryService countryService;

	@GetMapping
	public List<CountryResponse> getAllCountries() {
		List<CountryResponse> response = countryService.getAllCountries();
		if (!CollectionUtils.isEmpty(response)) {
			return response;
		}
		else {
			return new ArrayList<CountryResponse>();
		}
	}

	@GetMapping("/{country_id}")
	public CountryResponse getAllCountry(@PathVariable("country_id") String countryId) {
		return countryService.getCountryById(countryId);
	}
}
