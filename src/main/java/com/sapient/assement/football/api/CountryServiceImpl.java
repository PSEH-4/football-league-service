package com.sapient.assement.football.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sapient.assement.football.messaging.CountryResponse;

@Service
public class CountryServiceImpl implements CountryService {

	@Override
	public List<CountryResponse> getAllCountries() {
		return buildCountryResponse();
	}

	@Override
	public CountryResponse getCountryById(String countryId) {
		List<CountryResponse> countries = buildCountryResponse();
		Optional<CountryResponse> result = countries.stream().filter(country -> country.getCountryId().equals(countryId)).findAny();
		if (result.isPresent()) {
			return result.get();
		}
		else {
			return null;
		}
	}

	private List<CountryResponse> buildCountryResponse() {
		List<CountryResponse> countries = new ArrayList<>();
		countries.add(addCountry("CN000001", "ARGENTINA"));
		countries.add(addCountry("CN000002", "COLUMBIA"));
		countries.add(addCountry("CN000003", "FRANCE"));
		countries.add(addCountry("CN000004", "ITALY"));
		countries.add(addCountry("CN000005", "JAPAN"));
		countries.add(addCountry("CN000006", "KOREA REPUBLIC"));
		countries.add(addCountry("CN000007", "MEXICO"));
		countries.add(addCountry("CN000008", "NORWAY"));
		countries.add(addCountry("CN000009", "PORTUGAL"));
		countries.add(addCountry("CN000010", "URUGUAY"));
		return countries;
	}

	private CountryResponse addCountry(String countryId, String countryName) {
		CountryResponse country = new CountryResponse();
		country.setCountryId(countryId);
		country.setCountryName(countryName);
		return country;
	}
}
