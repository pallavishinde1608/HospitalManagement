package org.hospital.admin.repository;

import java.util.List;

import org.hospital.admin.model.RecepModel;

public interface RecepRepository {

	boolean isAddRecep(RecepModel rmodel);

	List<RecepModel> getAllRecep();

	boolean isDeleteRecep(int rid);

	int getRecep(String u, String p);

	boolean isUpdateRecep(RecepModel rmodel);

}
