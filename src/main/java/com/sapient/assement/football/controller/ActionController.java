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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.assement.football.api.action.ActionService;
import com.sapient.assement.football.api.country.CountryService;
import com.sapient.assement.football.messaging.CountryResponse;
import com.sapient.assement.football.messaging.ResponseModel;

@RestController
public class ActionController {

	@Autowired
	private ActionService actionService;

	@GetMapping
	public List<? extends ResponseModel> getAction(@RequestParam(name = "action") String action) {
		return actionService.getAction(action);
	}
}
