package com.sapient.assement.football.api.country;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.sapient.assement.football.messaging.CountryResponse;
import com.sapient.assement.football.messaging.Status;
import com.sapient.assement.football.util.RestUtil;

@Service
public class CountryServiceImpl implements CountryService {

	@Autowired
	private RestUtil restUtil;

	@Override
	public List<CountryResponse> getAllCountries() {
		return (List<CountryResponse>) restUtil.doGet("get_countries");
	}

	@Override
	public CountryResponse getCountryByName(String countryName) {
		List<CountryResponse> countries = getAllCountries();
		Optional<CountryResponse> response = countries.stream().filter(country -> country.getCountryName().equals(countryName)).findAny();
		if (response.isPresent()) {
			return response.get();
		}
		else {
			return null;
		}
	}

}
