package com.sapient.assement.football.controller;

import java.util.ArrayList;
import java.util.List;

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

	@GetMapping("/{country_name}")
	public CountryResponse getCountryByName(@PathVariable("country_name") String countryName) {
		return countryService.getCountryByName(countryName);
	}

}
