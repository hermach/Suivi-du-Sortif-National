package com.SPN.services;

import java.util.List;

import com.SPN.model.entiteis.criteres;

public interface i_criteresSRV {

	void addone(criteres critere);

	List<criteres> getAll();

	List<criteres> getAllcriter_de_sport(int id);
	criteres getone(int id);

	void deleteone(int id);

}