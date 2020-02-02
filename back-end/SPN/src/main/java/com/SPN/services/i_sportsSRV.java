package com.SPN.services;

import java.util.List;

import com.SPN.model.entiteis.sports;

public interface i_sportsSRV {

	void addone(sports sport);

	List<sports> getAll();

	sports getone(int id);

	void deleteone(int id);

}