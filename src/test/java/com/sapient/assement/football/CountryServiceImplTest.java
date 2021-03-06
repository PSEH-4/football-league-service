package com.sapient.assement.football;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Test;
import org.mockito.Mock;

import com.sapient.assement.football.api.country.CountryService;
import com.sapient.assement.football.messaging.CountryResponse;

public class CountryServiceImplTest {

	@Mock
	private CountryService countryService;

	@Test
	public void getAllCountriesSuccess() {
		List<CountryResponse> countries = countryService.getAllCountries();
		assertNotNull(countries);
	}

	
}
