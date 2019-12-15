package com.publicis.sapient.microservices.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Locations {
	@Id
	//@GeneratedValue
	@JsonIgnore
	private Integer id;
	@NotNull
	private String code;
	@NotNull
	private String name;
	
	public Locations() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Locations(Integer id, String code, String name) {
		this.id = id;
		this.code = code;
		this.name = name;
	}

     
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
