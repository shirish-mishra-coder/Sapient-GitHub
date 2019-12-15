package com.publicis.sapient.microservices.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.publicis.sapient.microservices.entities.Locations;

@Repository
public interface LocationsRepo extends JpaRepository<Locations, Integer>{
    @Query(value="select l from Locations l where l.code = :code")  
	public Locations findByCode(@Param("code")String code);
	

}
