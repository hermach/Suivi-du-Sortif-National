package com.SPN.model.DAO;

import java.util.List;

import com.SPN.model.entiteis.criteres;

public interface i_criteresDAO {

	void addone(criteres critere);

	List<criteres> getAll();
	List<criteres> getAllcriter_de_sport(int id);
	criteres getone(int id);

	void deleteone(int id);

}