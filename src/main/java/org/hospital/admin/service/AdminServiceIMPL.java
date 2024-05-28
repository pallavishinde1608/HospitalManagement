package org.hospital.admin.service;

import java.util.List;

import org.hospital.admin.model.adminModel;
import org.hospital.admin.repository.*;

public class AdminServiceIMPL implements Adminservice{
	AdminRepository arepo=new AdminRepositoryIMPL();
	@Override
	public int getAdmin(adminModel amodel) {
		
		return arepo.getAdmin(amodel);
	}
	
	
}
