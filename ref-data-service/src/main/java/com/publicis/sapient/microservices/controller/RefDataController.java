package com.publicis.sapient.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.publicis.sapient.microservices.entities.Commodities;
import com.publicis.sapient.microservices.entities.Counterparties;
import com.publicis.sapient.microservices.entities.Locations;
import com.publicis.sapient.microservices.services.CommoditiesService;
import com.publicis.sapient.microservices.services.CounterPartiesService;
import com.publicis.sapient.microservices.services.LocationsService;

@RestController
public class RefDataController {

	@Autowired
	private CommoditiesService commodities;

	@Autowired
	private CounterPartiesService counterparties;

	@Autowired
	private LocationsService locations;

	@GetMapping("/locations/code/{code}")
	public Locations retriveLocations(@PathVariable String code) {
		
		return locations.retriveLocations(code);
	}

	@GetMapping("/counter-parties/code/{code}")
	public Counterparties retriveCounterparties(@PathVariable String code) {
		
		return counterparties.retriveCounterparties(code);
	}

	@GetMapping("/commodities/code/{code}")
	public Commodities retriveCommodities(@PathVariable String code) {
		
		return commodities.retriveCommodities(code);
	}

}
