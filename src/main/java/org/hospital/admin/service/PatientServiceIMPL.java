package org.hospital.admin.service;

import java.util.List;

import org.hospital.admin.model.DoctorModel;
import org.hospital.admin.model.PatientModel;
import org.hospital.admin.repository.*;

public class PatientServiceIMPL implements PatientService{
	PatientRepository prepo=new PatientRepositoryIMPL();
	@Override
	public boolean isAddPatient(PatientModel pmodel) {
		
		return prepo.isAddPatient(pmodel);
	}
	@Override
	public List<Object[]> getAllPatient() {
	
		return prepo.getAllPatient();
	}
	@Override
	public boolean isDeletePatientById(int pid) {
		return prepo.isDeletePatient(pid);
	}
	@Override
	public boolean isUpdatePatient(PatientModel pmodel) {

		return prepo.isUpdatePatient(pmodel);
	}
	@Override
	public List<PatientModel> isSearchPatientByName(String name) {
		
		return prepo.isSearchPatientByName(name);
	}
	@Override
	public int getPatient(String u, String p) {
		
		return prepo.getPatient(u,p);
	}
	@Override
	public List<Object[]> getPatient(int PatientId) {
	
		return prepo.getPatientLogin(PatientId);
	}
	@Override
	public boolean isUpdatePatientLogin(PatientModel pmodel) {
		// TODO Auto-generated method stub
		return prepo.isUpdatePatientLogin(pmodel);
	}
	

}
