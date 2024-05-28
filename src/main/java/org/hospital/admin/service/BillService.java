package org.hospital.admin.service;

import java.util.List;

import org.hospital.admin.model.*;

public interface BillService {
	public int isAddBill(Billmodel bmodel);
	public List<Object[]> getAllBill();
	public boolean isUpdateBill(Billmodel bmodel);
	public boolean isDeleteBillById(int billid);

}
