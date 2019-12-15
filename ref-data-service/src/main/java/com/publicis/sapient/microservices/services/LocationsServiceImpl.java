package com.publicis.sapient.microservices.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.publicis.sapient.microservices.entities.Locations;
import com.publicis.sapient.microservices.exception.RefDataNotFoundException;
import com.publicis.sapient.microservices.repo.LocationsRepo;

@Service
public class LocationsServiceImpl implements LocationsService {
	@Autowired
	private LocationsRepo locationsRepo;

	@Override
	public Locations retriveLocations(String code) {
		if (locationsRepo.findByCode(code) == null) {
			throw new RefDataNotFoundException("code " + code);
		}

		return locationsRepo.findByCode(code);
	}

}
