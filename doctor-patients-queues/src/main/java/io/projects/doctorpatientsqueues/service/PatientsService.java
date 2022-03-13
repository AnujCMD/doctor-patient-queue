package io.projects.doctorpatientsqueues.service;

import java.util.List;

import io.projects.doctorpatientsqueues.entity.Patients;

public interface PatientsService {
	List<Patients> getALLPatients();
	
	Patients savePatient(Patients patient);
	Patients getPatientsById(Long id);
	Patients updatePatients(Patients patient);
	void deletePatientById(Long id);
}
