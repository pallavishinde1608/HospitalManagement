package org.hospital.admin.service;

import java.util.List;

import org.hospital.admin.model.Billmodel;
import org.hospital.admin.repository.*;

public class BillServiceIMPL implements BillService{
    BillRepository brepo=new BillRepositoryIMPL();
	@Override
	public int isAddBill(Billmodel bmodel) {
	
		return brepo.isAddBill(bmodel);
	}
	@Override
	public List<Object[]> getAllBill() {
		// TODO Auto-generated method stub
		return brepo.getAllBill();
	}
	@Override
	public boolean isUpdateBill(Billmodel bmodel) {
		// TODO Auto-generated method stub
		return brepo.isUpdateBill(bmodel);
	}
	@Override
	public boolean isDeleteBillById(int billid) {
		// TODO Auto-generated method stub
		return brepo.isDeleteBill(billid);
	}

}
