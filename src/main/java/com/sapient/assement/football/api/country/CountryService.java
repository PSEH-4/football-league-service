package com.sapient.assement.football.api.country;

import java.util.List;

import com.sapient.assement.football.messaging.CountryResponse;

public interface CountryService {

	List<CountryResponse> getAllCountries();

	CountryResponse getCountryByName(String countryName);

}
