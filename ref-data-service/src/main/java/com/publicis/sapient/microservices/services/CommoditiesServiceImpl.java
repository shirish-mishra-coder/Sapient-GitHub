package com.publicis.sapient.microservices.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.publicis.sapient.microservices.entities.Commodities;
import com.publicis.sapient.microservices.exception.RefDataNotFoundException;
import com.publicis.sapient.microservices.repo.CommoditiesRepo;

@Service
public class CommoditiesServiceImpl implements CommoditiesService {
	@Autowired
	private CommoditiesRepo commoditiesRepo;

	@Override
	public Commodities retriveCommodities(String code) {
		if (commoditiesRepo.findByCode(code) == null) {
			throw new RefDataNotFoundException("id " + code);
		}

		return commoditiesRepo.findByCode(code);
	}

}
