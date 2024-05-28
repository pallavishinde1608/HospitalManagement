package org.hospital.admin.repository;

import java.util.List;

import org.hospital.admin.model.Billmodel;

public interface BillRepository {
	public int isAddBill(Billmodel bmodel);

	public List<Object[]> getAllBill();

	public boolean isUpdateBill(Billmodel bmodel);

	public boolean isDeleteBill(int billid);

}
