package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private String name;
    private int maxPatientsPerDay;
    
	public Doctor(Long id, String name, int maxPatientsPerDay) {
		super();
		this.id = id;
		this.name = name;
		this.maxPatientsPerDay = maxPatientsPerDay;
	}
	
	public Doctor() {
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMaxPatientsPerDay() {
		return maxPatientsPerDay;
	}
	public void setMaxPatientsPerDay(int maxPatientsPerDay) {
		this.maxPatientsPerDay = maxPatientsPerDay;
	}
    
	
}
