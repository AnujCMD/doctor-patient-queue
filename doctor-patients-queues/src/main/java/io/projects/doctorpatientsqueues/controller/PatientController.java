package io.projects.doctorpatientsqueues.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import io.projects.doctorpatientsqueues.entity.Patients;
import io.projects.doctorpatientsqueues.service.PatientsService;

@Controller
public class PatientController {
	private PatientsService patientsService;

	public PatientController(PatientsService patientsService) {
		super();
		this.patientsService = patientsService;
	}
	
	@GetMapping("/patients")
	public String listPatients(Model model) {
		model.addAttribute("patients", patientsService.getALLPatients());
		return "patients";
	}
	
	@GetMapping("/patients/new")
	public String createPatientForm(Model model) {
		//create student object to hold student from data
		Patients patient = new Patients();
		model.addAttribute("patients", patient);
		return "create_patient";
		
	}
	@PostMapping("/patients")
	public String savePatient(@ModelAttribute("patient") Patients Patient) {
		patientsService.savePatient(Patient);
		return "redirect:/patients";
	}
	
	@GetMapping("/patients/edit/{id}")
	public String editPatientForm(@PathVariable Long id, Model model) {
		// create  student object to hold patient form data
		model.addAttribute("patients", patientsService.getPatientsById(id));
		return "edit_patient";
	}

	@PostMapping("/patients/{id}")
	public String updatePatients(@PathVariable Long id, @ModelAttribute("patient") Patients patients, Model model) {
		//get patient from db by id
		Patients existPatient = patientsService.getPatientsById(id);
		existPatient.setId(id);
		existPatient.setFirstName(patients.getFirstName());
		existPatient.setLastName(patients.getLastName());
		existPatient.setEmail(patients.getEmail());
		existPatient.setProblem(patients.getProblem());
		existPatient.setNote(patients.getNote());
		
		patientsService.updatePatients(existPatient);
		return "redirect:/patients";
		
	}
	
	//handler method to handle delete student request
	@GetMapping("/patients/{id}")
	public String deletePatient(@PathVariable Long id) {
		patientsService.deletePatientById(id);
		return "redirect:/patients";
	}
}
