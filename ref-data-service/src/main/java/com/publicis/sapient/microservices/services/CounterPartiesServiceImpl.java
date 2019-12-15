package com.publicis.sapient.microservices.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.publicis.sapient.microservices.entities.Counterparties;
import com.publicis.sapient.microservices.exception.RefDataNotFoundException;
import com.publicis.sapient.microservices.repo.CounterpartiesRepo;

@Service
public class CounterPartiesServiceImpl implements CounterPartiesService {
	@Autowired
	private CounterpartiesRepo counterpartiesRepo;

	@Override
	public Counterparties retriveCounterparties(String code) {
		if (counterpartiesRepo.findByCode(code) == null) {
			throw new RefDataNotFoundException("id " + code);
		}

		return counterpartiesRepo.findByCode(code);
	}

}
