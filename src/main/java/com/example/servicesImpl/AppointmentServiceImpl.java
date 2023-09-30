package com.example.servicesImpl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Appointment;
import com.example.repository.AppointmentRepo;
import com.example.services.AppointmentService;

@Service
public class AppointmentServiceImpl implements AppointmentService{
	
	@Autowired
	AppointmentRepo appointmentRepo;

	@Override
	public List<Appointment> getAppointmentsByDoctorAndDate(Long doctorId, LocalDateTime start, LocalDateTime end) {
		return appointmentRepo.findByDoctorIdAndAppointmentTimeBetween(doctorId, start, end);
	}

	@Override
	public void bookAppointment(Appointment appointment) {
		appointmentRepo.save(appointment);
		
	}

}
