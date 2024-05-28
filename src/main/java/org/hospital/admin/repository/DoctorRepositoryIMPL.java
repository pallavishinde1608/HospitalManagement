package org.hospital.admin.repository;

import java.util.ArrayList;
import java.util.List;

import org.hospital.admin.Config.DBConfig;
import org.hospital.admin.model.*;

public class DoctorRepositoryIMPL extends DBConfig implements DoctorRepository{
	 List<DoctorModel> list=new ArrayList<DoctorModel>();
	 List<Object[]> listPatient;
	 DoctorModel listdoctor;
int did=0;
	public int getDoctorIdAutomatic()
    {
    	try {
    		stmt=conn.prepareStatement("select max(did) from doctor");
    		rs=stmt.executeQuery();
    		if(rs.next())
    		{
    			did=rs.getInt(1);
    			
    			
    		}
    		return ++did;
    		
    	}
    	catch(Exception ex)
    	{
    	   return -1;
    	}
    }
	public boolean isAddDoctor(DoctorModel dmodel) {
		
		try {

			int did=this.getDoctorIdAutomatic();
			stmt=conn.prepareStatement("insert into doctor values(?,?,?,?,?,?,?)");
		    stmt.setInt(1, did);
		    stmt.setString(2,dmodel.getName());
		    stmt.setString(4,dmodel.getSpecialization());
		    stmt.setString(3,dmodel.getContact());
		    stmt.setString(5,dmodel.getEmail());
		    stmt.setString(6,dmodel.getSchedule());
		    stmt.setString(7,dmodel.getCategory());
		   
		    
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
	public List<DoctorModel> getAllDoctor() {
		try {
			stmt=conn.prepareStatement("select *from doctor");
			rs=stmt.executeQuery();
			while(rs.next())
			{
				DoctorModel dmodel=new DoctorModel();
				dmodel.setDid(rs.getInt(1));
				dmodel.setName(rs.getString(2));
				dmodel.setSpecialization(rs.getString(3));
				dmodel.setContact(rs.getString(4));
				dmodel.setEmail(rs.getString(5));
				dmodel.setSchedule(rs.getString(6));
				dmodel.setCategory(rs.getString(7));
				list.add(dmodel);
			}
			return list.size()>0?list:null;
			
		}
		catch(Exception ex)
		{
			System.out.println("error in doctor not view......"+ex);
			return null;
		}
	}
	@Override
	public boolean isDeleteDoctorById(int did) {
	      try {
	    	  stmt=conn.prepareStatement("delete from doctor where did=?");
	    	  stmt.setInt(1, did);
	    	  int value=stmt.executeUpdate();
	    	  return value>0?true:false;
	    			
	      }
	      catch(Exception ex)
	      {
	    	  System.out.println("error in doctor not delete...."+ex);
	    	  return false;
	      }
		
	}
	@Override
	public boolean isUpdateDoctor(DoctorModel dmodel) {
	
		try {
			stmt=conn.prepareStatement("update doctor set dname=?,specialization=?,contact=?,email=?,schedule=?,category=? where did=?");
			stmt.setString(1,dmodel.getName());
			stmt.setString(2,dmodel.getSpecialization());
			stmt.setString(3,dmodel.getContact());
			stmt.setString(4,dmodel.getEmail());
			stmt.setString(5,dmodel.getSchedule());
			stmt.setString(6, dmodel.getCategory());
			stmt.setInt(7, dmodel.getDid());
			int value=stmt.executeUpdate();
			return value>0?true:false;
		}
		catch(Exception ex)
		{
			System.out.println("erro in doctor not update "+ex);
			return false;
		}
		
	}
	@Override
	public List<DoctorModel>isSerachDoctorByName(String name) {
		try {
			stmt=conn.prepareStatement("select *from doctor where email=?");
			stmt.setString(1,name);
			  rs=stmt.executeQuery();
			  
			  while(rs.next())
			  {  
				  DoctorModel dmodel=new DoctorModel();
					dmodel.setDid(rs.getInt(1));
					dmodel.setName(rs.getString(2));
					dmodel.setSpecialization(rs.getString(3));
					dmodel.setContact(rs.getString(4));
					dmodel.setEmail(rs.getString(5));
					dmodel.setSchedule(rs.getString(6));
					list.add(dmodel);
				}
			 
				return list.size()>0?list:null;
				
			}
			catch(Exception ex)
			{
				System.out.println("error in doctor not view......"+ex);
				return null;
			}
	}
	@Override
	public int getDoctor(String email,String contact) {
		try {
			stmt=conn.prepareStatement("select *from doctor where Email=? and contact=?");
			stmt.setString(1,email);
			stmt.setString(2,contact);
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
	public List<Object[]> getDoctorLogin(int did) {
		try {
		
			stmt=conn.prepareStatement("select p.pname,p.contact,p.age,p.gender,p.category,p.pdate,p.type,pr.medicine,d.did from patient p inner join prescription pr on p.patientid=pr.patientid inner join doctor d on d.did=pr.did where d.did=?");
			stmt.setInt(1,did);
			 
			  rs=stmt.executeQuery();
			  
			 
				  while(rs.next())
					{
					 
					  Object []obj=new Object[]{rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getInt(9)};
						
						listPatient.add(obj);
					}
						 return listPatient.size()>0?listPatient:null;
			    		 
					}
		
				catch(Exception ex)
				   {
					   System.out.println("error is patient not display..."+ex);
				   
				   return null;
			    }
		
		
	}

}
