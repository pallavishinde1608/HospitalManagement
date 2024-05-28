package org.hospital.admin.service;

import java.util.List;

import org.hospital.admin.model.*;

public interface DoctorService {
	public boolean isAddDoctor(DoctorModel dmodel);
	 public List<DoctorModel> getAllDoctor();
	 public boolean isDeleteDoctorById(int did);
	 public boolean isUpdateDoctorById(DoctorModel dmodel);
	public List<DoctorModel> isSearchDoctorByName(String name);
	public int getDoctor(String email,String contact);
	public List<Object[]> getDoctorLogin(int did);

}
