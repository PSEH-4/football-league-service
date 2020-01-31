package com.sapient.assement.football.api;

import java.util.List;

import com.sapient.assement.football.messaging.CountryResponse;

public interface CountryService {

	List<CountryResponse> getAllCountries();
	
	CountryResponse getCountryById(String countryId);
}
