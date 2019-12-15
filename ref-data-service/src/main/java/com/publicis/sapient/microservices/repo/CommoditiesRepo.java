package com.publicis.sapient.microservices.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.publicis.sapient.microservices.entities.Commodities;

@Repository
public interface CommoditiesRepo extends JpaRepository<Commodities, Integer> {
	@Query(value="select c from Commodities c where c.code = :code")  
	public Commodities findByCode(@Param("code")String code);	

}
