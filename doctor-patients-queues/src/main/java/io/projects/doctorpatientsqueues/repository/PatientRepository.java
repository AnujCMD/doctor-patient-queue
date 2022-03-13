package io.projects.doctorpatientsqueues.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.projects.doctorpatientsqueues.entity.Patients;


public interface PatientRepository extends JpaRepository<Patients, Long>{
	
}
