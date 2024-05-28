package org.hospital.admin.repository;

import java.util.List;

import org.hospital.admin.model.PatientModel;
import org.hospital.admin.model.PrescriptionModel;

public interface PrescriptionRepository {

	boolean isAddPrescription(PrescriptionModel pmodel);

	List<Object[]> getAllPrescription();

	boolean isDeletePrescription(int pid);

	List<Object[]> getDoctorLoginPatient(int did);

	boolean isUpdateMedicine(PrescriptionModel pmodel);

}
