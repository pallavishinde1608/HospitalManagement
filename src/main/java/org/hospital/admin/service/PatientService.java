package org.hospital.admin.service;

import java.util.List;

import org.hospital.admin.model.DoctorModel;
import org.hospital.admin.model.PatientModel;

public interface PatientService {
	public boolean isAddPatient(PatientModel pmodel);
	 public List<Object[]> getAllPatient();
	 public boolean isDeletePatientById(int pid);
	 public boolean isUpdatePatient(PatientModel pmodel);
	 public List<PatientModel> isSearchPatientByName(String name);
	 public int getPatient(String u, String p);
	 public List<Object[]> getPatient(int PatientId);
	public boolean isUpdatePatientLogin(PatientModel pmodel);

	

}
