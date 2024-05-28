package org.hospital.admin.repository;

import java.util.List;

import org.hospital.admin.model.DoctorModel;
import org.hospital.admin.model.PatientModel;

public interface PatientRepository {

	boolean isAddPatient(PatientModel pmodel);

	List<Object[]> getAllPatient();

	boolean isDeletePatient(int pid);

	boolean isUpdatePatient(PatientModel pmodel);

	List<PatientModel> isSearchPatientByName(String name);

	int getPatient(String u, String p);

	List<Object[]> getPatientLogin(int patientId);

	boolean isUpdatePatientLogin(PatientModel pmodel);

	
}
