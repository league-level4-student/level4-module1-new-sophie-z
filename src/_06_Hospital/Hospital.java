package _06_Hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	ArrayList<Patient> unassignedPatients = new ArrayList<Patient>();
	public Hospital() {
		
	}
	public void addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		doctors.add(doctor);
	}

	public List<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return doctors;
	}

	public void addPatient(Patient patient) {
		// TODO Auto-generated method stub
		unassignedPatients.add(patient);
	}

	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return unassignedPatients;
	}

	public void assignPatientsToDoctors() {
		// TODO Auto-generated method stub
		
	}

}
