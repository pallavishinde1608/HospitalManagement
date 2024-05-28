package org.hospital.admin.service;

import java.util.List;

import org.hospital.admin.model.DoctorModel;
import org.hospital.admin.repository.*;
public class DoctorServiceIMPL implements DoctorService {
	DoctorRepository drepo=new DoctorRepositoryIMPL();
	@Override
	public boolean isAddDoctor(DoctorModel dmodel) {

		return drepo.isAddDoctor(dmodel);
	}
	@Override
	public List<DoctorModel> getAllDoctor() {
	
		return drepo.getAllDoctor();
	}
	@Override
	public boolean isDeleteDoctorById(int did) {
		
		return drepo.isDeleteDoctorById(did);
	}
	
	@Override
	public boolean isUpdateDoctorById(DoctorModel dmodel) {
		
		return drepo.isUpdateDoctor(dmodel);
	}
	@Override
	public List<DoctorModel> isSearchDoctorByName(String name) {
		
		return drepo.isSerachDoctorByName(name);
	}
	public int getDoctor(String email,String contact) {
		
		return drepo.getDoctor(email,contact);
		
	}
	@Override
	public List<Object[]> getDoctorLogin(int did) {
	
		return drepo.getDoctorLogin(did);
	}
	
	

}
