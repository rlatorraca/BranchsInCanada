package com.rlsp.CitiesOfCanada.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rlsp.CitiesOfCanada.model.City;
import com.rlsp.CitiesOfCanada.repository.Cities;

@RestController
@RequestMapping("/cities")
public class CidadesController {

	@Autowired
	private Cities cities;
	
	//@GetMapping("/{abbr}")
	@RequestMapping(method = RequestMethod.GET,  produces = "application/json")
	public List<City> byAbbr(@RequestParam String abbr) {
		return cities.byAbbrProvince(abbr);
	}
	
}
