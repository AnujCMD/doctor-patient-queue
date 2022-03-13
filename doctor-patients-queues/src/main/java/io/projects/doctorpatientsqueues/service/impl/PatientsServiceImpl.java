package io.projects.doctorpatientsqueues.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import io.projects.doctorpatientsqueues.service.PatientsService;
import io.projects.doctorpatientsqueues.entity.Patients;
import io.projects.doctorpatientsqueues.repository.PatientRepository;
@Service
public class PatientsServiceImpl implements PatientsService{
	private PatientRepository PatientRepository;
	
	public PatientsServiceImpl(io.projects.doctorpatientsqueues.repository.PatientRepository patientRepository) {
		super();
		PatientRepository = patientRepository;
	}

	@Override
	public List<Patients> getALLPatients(){
		return PatientRepository.findAll();
	}

	@Override
	public Patients savePatient(Patients patient) {
		return PatientRepository.save(patient);
	}

	@Override
	public Patients getPatientsById(Long id) {
		return PatientRepository.findById(id).get();
	}

	@Override
	public Patients updatePatients(Patients patient) {
		return PatientRepository.save(patient);
	}

	@Override
	public void deletePatientById(Long id) {
		PatientRepository.deleteById(id);
		
	}

}
