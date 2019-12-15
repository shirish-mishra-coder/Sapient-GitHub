package com.publicis.sapient.microservices.services;

import com.publicis.sapient.microservices.entities.Locations;

public interface LocationsService {
	public Locations retriveLocations(String code);
}
