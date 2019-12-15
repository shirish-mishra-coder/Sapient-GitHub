package com.publicis.sapient.microservices.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.publicis.sapient.microservices.entities.Counterparties;

@Repository
public interface CounterpartiesRepo extends JpaRepository<Counterparties, Integer> {

	@Query(value="select c from Counterparties c where c.code = :code")  
	public Counterparties findByCode(@Param("code")String code);

}
