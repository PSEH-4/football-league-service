package com.sapient.assement.football.controller;

import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sapient.assement.football.api.CountryService;
import com.sapient.assement.football.messaging.CountryResponse;

@Controller("/country")
public class CountryController {

	@Autowired
	private CountryService countryService;

	@GetMapping
	public Response getAllCountries() {
		List<CountryResponse> response = countryService.getAllCountries();
		if (CollectionUtils.isEmpty(response)) {
			return Response.ok(response).build();
		}
		else {
			return Response.status(Status.NOT_FOUND).build();
		}
	}

	@GetMapping("/{country_id}")
	public Response getAllCountry(@PathVariable("country_id") String countryId) {
		CountryResponse response = countryService.getCountryById(countryId);
		if (response != null) {
			return Response.ok(response).build();
		}
		else {
			return Response.status(Status.NOT_FOUND).build();
		}
	}
}
