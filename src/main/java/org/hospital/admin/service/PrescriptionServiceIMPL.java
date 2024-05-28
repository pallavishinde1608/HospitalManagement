package org.hospital.admin.service;

import java.util.List;

import org.hospital.admin.model.PatientModel;
import org.hospital.admin.model.PrescriptionModel;
import org.hospital.admin.repository.*;

public class PrescriptionServiceIMPL implements  PrescriptionService{
	PrescriptionRepository prrepo=new PrescriptionRepositoryIMPL();
	
	@Override
	public List<Object[]> getAllPrescription() {
		
		return prrepo.getAllPrescription();
	}
	@Override
	public boolean isDeletePrescriptionById(int pid) {
		
		return prrepo.isDeletePrescription(pid);
	}
	public boolean isAddPrescription(PrescriptionModel pmodel) {
		
		return prrepo.isAddPrescription(pmodel);
	}
	@Override
	public List<Object[]> getDoctorLoginPatient(int did) {
	
		return prrepo.getDoctorLoginPatient(did);
	}
	@Override
	public boolean isUpdateMedicine(PrescriptionModel pmodel) {
		
		return prrepo.isUpdateMedicine(pmodel);
	}

	

}
