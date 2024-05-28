package org.hospital.admin.repository;

import java.util.ArrayList;
import java.util.List;

import org.hospital.admin.Config.DBConfig;
import org.hospital.admin.model.DoctorModel;
import org.hospital.admin.model.adminModel;

public class AdminRepositoryIMPL extends DBConfig implements AdminRepository {
	List<adminModel> list=new ArrayList<adminModel>();
	@Override
	public int getAdmin(adminModel amodel) {
		
		
			try {
				stmt=conn.prepareStatement("select *from admin where username=? and password=?");
				stmt.setString(1,amodel.getUsername());
				stmt.setString(2,amodel.getPassword());
				rs=stmt.executeQuery();
				return rs.next()?1:0;
		           
		      
				
			}
			catch(Exception ex)
			{
				System.out.println("error in logon controler "+ex);
			}
			return 0;
		
	}
}
