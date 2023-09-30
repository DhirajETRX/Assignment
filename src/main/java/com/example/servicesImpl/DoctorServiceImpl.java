package com.example.servicesImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Doctor;
import com.example.repository.DoctorRepo;
import com.example.services.DoctorService;

@Service
public class DoctorServiceImpl implements DoctorService{
	
	@Autowired
	private DoctorRepo doctorRepo;

	
	@Override
	public List<Doctor> getAllDoctors() {
		List<Doctor> doctors=doctorRepo.findAll();
		return doctors;
	}

	@Override
	public Doctor getDoctorById(Long id) {
		return doctorRepo.findById(id).orElse(null);
	}

	@Override
	public Doctor createDoctor(Doctor doctor) {
		return doctorRepo.save(doctor);
	}

	



}
