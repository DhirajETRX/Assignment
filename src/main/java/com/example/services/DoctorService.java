package com.example.services;

import java.util.List;
import com.example.model.Doctor;

public interface DoctorService {
	
	public Doctor createDoctor(Doctor doctor);
	public List<Doctor> getAllDoctors();
	public Doctor getDoctorById(Long id);
}
