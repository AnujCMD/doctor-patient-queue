package io.projects.doctorpatientsqueues;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.projects.doctorpatientsqueues.entity.Patients;
import io.projects.doctorpatientsqueues.repository.PatientRepository;

@SpringBootApplication
public class DoctorPatientsQueuesApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DoctorPatientsQueuesApplication.class, args);
	}
	
	@Autowired
	private PatientRepository patientsRepository;
	@Override
	public void run(String... args) throws Exception{
		/*Patients s1 = new Patients("Ramesh", "Suresh", "ramesh@gmail.com");
		Patients s2 = new Patients("Ramesh", "Suresh", "ramesh@gmail.com");
		Patients s3 = new Patients("Ramesh", "Suresh", "ramesh@gmail.com");
		patientsRepository.save(s1);
		patientsRepository.save(s2);
		patientsRepository.save(s3);*/
	}

}
