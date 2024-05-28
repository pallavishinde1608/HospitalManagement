package org.hospital.admin.repository;

import java.util.ArrayList;
import java.util.List;

import org.hospital.admin.Config.DBConfig;
import org.hospital.admin.model.*;

public class PrescriptionRepositoryIMPL extends DBConfig implements PrescriptionRepository{
	List<Object[]> listPatient;
	public boolean isAddPrescription(PrescriptionModel pmodel) { 
		
		try {

			
			stmt=conn.prepareStatement("insert into prescription values(?,?,?)");
			stmt.setInt(1,pmodel.getPid());
		    stmt.setInt(2, pmodel.getDid());
		    stmt.setString(3,pmodel.getMedicine());
		   
		    
		    
		    int value=stmt.executeUpdate();
		    return value>0?true:false;
		
		}
		catch(Exception ex)
		{
			System.out.println("error in add prescription is "+ex);
			return false;
		}
	}

	@Override
	public List<Object[]> getAllPrescription() {
		try {
			listPatient=new ArrayList<Object[]>();
			stmt=conn.prepareStatement("select p.pname,d.dname,pr.medicine from patient p  inner join Prescription pr on p.patientid=pr.patientid inner join doctor d on d.did=pr.did");
			  
			  rs=stmt.executeQuery();
			  
			 
				  while(rs.next())
					{
					 
						Object []obj=new Object[]{rs.getString(1),rs.getString(2),rs.getString(3)};
						
						listPatient.add(obj);
						

					}
				  return listPatient.size()>0?listPatient:null;
		    		
		}
		catch(Exception ex)
		   {
			   System.out.println("error is prescription not display..."+ex);
		   
		   return null;
	    }

	}

	@Override
	public boolean isDeletePrescription(int pid) {
		 try {
	    	  stmt=conn.prepareStatement("delete from prescription where patientid=?");
	    	  stmt.setInt(1, pid);
	    	  int value=stmt.executeUpdate();
	    	  return value>0?true:false;
	    			
	      }
	      catch(Exception ex)
	      {
	    	  System.out.println("error in patient not delete...."+ex);
	    	  return false;
	      }
	}

	@Override
	public List<Object[]> getDoctorLoginPatient(int did) {
		
		try {
			listPatient=new ArrayList<Object[]>();
			stmt=conn.prepareStatement("select p.pname,p.contact,p.age,p.gender,p.category,p.pdate,p.type,pr.medicine,p.patientid,d.did from patient p inner join prescription pr on p.patientid=pr.patientid inner join doctor d on d.did=pr.did where d.did=?");
			stmt.setInt(1,did);
			 
			  rs=stmt.executeQuery();
			  
			 
				  while(rs.next())
					{
					 
						Object []obj=new Object[]{rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getInt(9),rs.getInt(10)};
						
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

	@Override
	public boolean isUpdateMedicine(PrescriptionModel pmodel) {
		try {
			listPatient=new ArrayList<Object[]>();
			stmt=conn.prepareStatement("update  patient p inner join prescription pr on p.patientid=pr.patientid set pr.medicine=? where p.patientid=?");
			stmt.setString(1, pmodel.getMedicine());
			stmt.setInt(2,pmodel.getPid());
			int value=stmt.executeUpdate();
			  if(value>0)
			  {
				 return true;
			  }
			  else {
				  
				  return false;
			  }
		}
		catch(Exception ex)
		   {
			   System.out.println("error is patient not display..."+ex);
		   
		   return false;
	    }
	
	}


	

}
