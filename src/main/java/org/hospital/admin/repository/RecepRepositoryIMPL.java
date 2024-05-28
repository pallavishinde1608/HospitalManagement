package org.hospital.admin.repository;

import java.util.ArrayList;
import java.util.List;

import org.hospital.admin.Config.DBConfig;
import org.hospital.admin.model.DoctorModel;
import org.hospital.admin.model.RecepModel;

public class RecepRepositoryIMPL extends DBConfig implements RecepRepository{
	int rid=0;
	 List<RecepModel> list=new ArrayList<RecepModel>();
	public int getRecepIdAutomatic()
    {
    	try {
    		stmt=conn.prepareStatement("select max(rid) from receptionist");
    		rs=stmt.executeQuery();
    		if(rs.next())
    		{
    			rid=rs.getInt(1);
    			
    			
    		}
    		return ++rid;
    		
    	}
    	catch(Exception ex)
    	{
    	   return -1;
    	}
    }
	public boolean isAddRecep(RecepModel rmodel) {
		try {

			int rid=this.getRecepIdAutomatic();
			stmt=conn.prepareStatement("insert into receptionist values(?,?,?,?)");
		    stmt.setInt(1,rid);
		    stmt.setString(2,rmodel.getName());
		    stmt.setString(3,rmodel.getEmail());
		    stmt.setString(4,rmodel.getContact());
		    int value=stmt.executeUpdate();
		    return value>0?true:false;
		
		}
		catch(Exception ex)
		{
			System.out.println("erro in add doctor is "+ex);
			return false;
		}
	}
	@Override
	public List<RecepModel> getAllRecep() {
		try {
			stmt=conn.prepareStatement("select *from receptionist");
			rs=stmt.executeQuery();
			while(rs.next())
			{
				RecepModel rmodel=new RecepModel();
				rmodel.setRid(rs.getInt(1));
				rmodel.setName(rs.getString(2));
				rmodel.setEmail(rs.getString(3));
				rmodel.setContact(rs.getString(4));
				list.add(rmodel);
			}
			return list.size()>0?list:null;
			
		}
		catch(Exception ex)
		{
			System.out.println("error in receptionist not view......"+ex);
			return null;
		}
	}
	@Override
	public boolean isDeleteRecep(int rid) {
		 try {
	    	  stmt=conn.prepareStatement("delete from receptionist where rid=?");
	    	  stmt.setInt(1, rid);
	    	  int value=stmt.executeUpdate();
	    	  return value>0?true:false;
	    			
	      }
	      catch(Exception ex)
	      {
	    	  System.out.println("error in receptionist not delete...."+ex);
	    	  return false;
	      }
	}
	@Override
	public int getRecep(String u, String p) {
		
		try {
			stmt=conn.prepareStatement("select *from receptionist where Email=? and contact=?");
			stmt.setString(1,u);
			stmt.setString(2,p);
			rs=stmt.executeQuery();
			
		if(rs.next())
		{ 
			return rs.getInt(1);
		}
		else{
			
			return 0;
		}
			
		}
		catch(Exception ex)
		{
			System.out.println("error in login controller "+ex);
			return 0;
		}
	}
	@Override
	public boolean isUpdateRecep(RecepModel rmodel) {
		
		try {
			stmt=conn.prepareStatement("update receptionist set name=?,email=?,contact=? where rid=?");
			stmt.setString(1,rmodel.getName());
			stmt.setString(2,rmodel.getEmail());
			stmt.setString(3,rmodel.getContact());
			stmt.setInt(4, rmodel.getRid());
			int value=stmt.executeUpdate();
			return value>0?true:false;
		}
		catch(Exception ex)
		{
			System.out.println("erro in doctor not update "+ex);
			return false;
		}
	}
	

}
