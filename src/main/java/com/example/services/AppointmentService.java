package com.example.services;

import java.time.LocalDateTime;
import java.util.List;

import com.example.model.Appointment;

public interface AppointmentService {
	
	public List<Appointment> getAppointmentsByDoctorAndDate(Long doctorId, LocalDateTime start, LocalDateTime end);
	public void bookAppointment(Appointment appointment);
}
