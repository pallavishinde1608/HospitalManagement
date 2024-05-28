package org.hospital.admin.repository;

import java.util.*;

import org.hospital.admin.Config.DBConfig;
import org.hospital.admin.model.Billmodel;
import org.hospital.admin.model.DoctorModel;

public class BillRepositoryIMPL extends DBConfig implements BillRepository{
	int bid=0;
	List<Object[]> listPatient;
	public int getBillIdAutomatic()
    {
    	try {
    		stmt=conn.prepareStatement("select max(billid) from bill");
    		rs=stmt.executeQuery();
    		if(rs.next())
    		{
    			bid=rs.getInt(1);
    			
    			
    		}
    		return ++bid;
    		
    	}
    	catch(Exception ex)
    	{
    	   return -1;
    	}
    }
	public int isAddBill(Billmodel bmodel) {

		try {

			int bid=this.getBillIdAutomatic();
			stmt=conn.prepareStatement("insert into bill values(?,?,?,?,?,?)");
		    
		    stmt.setInt(1,bmodel.getPid());
		    stmt.setString(2,bmodel.getDate());
		    stmt.setString(3,bmodel.getTime());
		    stmt.setInt(4, bmodel.getDoctorfee());
		    stmt.setInt(5,bmodel.getRoomcost());
		    stmt.setInt(6,bmodel.getTotal());
		    
		    int value=stmt.executeUpdate();
		    return value>0?1:0;
		
		}
		catch(Exception ex)
		{
			System.out.println("error in add bill is "+ex);
			return 0;
		}
	}
	@Override
	public List<Object[]> getAllBill() {
		
		try {
			listPatient=new ArrayList<Object[]>();
			stmt=conn.prepareStatement("select p.patientid,p.pname,b.billdate,b.billtime,b.doctorfee,b.roomcost,b.total from bill b  inner join patient p on b.patientid=p.patientid");
			  
			  rs=stmt.executeQuery();
			  
			 
				  while(rs.next())
					{
					 
						Object []obj=new Object[]{rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getInt(6),rs.getInt(7)};
						
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
	public boolean isUpdateBill(Billmodel bmodel) {
try {
			
			stmt=conn.prepareStatement("update bill set billdate=?,billtime=?,doctorfee=?,roomcost=?,total=? where patientid=?");
			stmt.setString(1,bmodel.getDate());
			stmt.setString(2,bmodel.getTime());
			stmt.setInt(3,bmodel.getDoctorfee());
			stmt.setInt(4, bmodel.getRoomcost());
			stmt.setInt(5, bmodel.getTotal());
			stmt.setInt(6,bmodel.getPid());
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
		 System.out.println("Error is patient not update"+ex);
		}
		return false;
	}
	@Override
	public boolean isDeleteBill(int billid) {
		 try {
	    	  stmt=conn.prepareStatement("delete from bill where patientid=?");
	    	  stmt.setInt(1, billid);
	    	  int value=stmt.executeUpdate();
	    	  return value>0?true:false;
	    			
	      }
	      catch(Exception ex)
	      {
	    	  System.out.println("error in doctor not delete...."+ex);
	    	  return false;
	      }
	}
}
