package com.app.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

// super class
@MappedSuperclass
public class BaseEntity {
	// Auto incr pk
	@Id // pk 
	@GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO INC
	Long id;
	
	public BaseEntity() {
		// TODO Auto-generated constructor stub
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
