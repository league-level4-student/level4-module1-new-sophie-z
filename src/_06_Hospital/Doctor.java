package _06_Hospital;

import java.util.ArrayList;
import java.util.List;

public abstract class Doctor {
	ArrayList<Patient> assignedPatients = new ArrayList<Patient>();
	void assignPatient(Patient patient) throws DoctorFullException {
		if(getPatients().size()==3) {
	    	throw new DoctorFullException();
	    }
		assignedPatients.add(patient);
	}
	
	public List<Patient> getPatients(){
		return assignedPatients;
	}

	void doMedicine() {
		for(int i = 0; i<assignedPatients.size(); i++) {
			assignedPatients.get(i).checkPulse();
		}
	}
}
