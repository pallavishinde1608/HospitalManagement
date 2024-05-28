package org.hospital.admin.service;

import java.util.List;

import org.hospital.admin.model.PatientModel;
import org.hospital.admin.model.PrescriptionModel;

public interface PrescriptionService {

	boolean isAddPrescription(PrescriptionModel pmodel);
	public List<Object[]> getAllPrescription();
	boolean isDeletePrescriptionById(int pid);
	public List<Object[]> getDoctorLoginPatient(int did);
	boolean isUpdateMedicine(PrescriptionModel pmodel);
	
}
