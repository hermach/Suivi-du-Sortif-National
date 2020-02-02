package com.SPN.services;

import java.util.List;

import com.SPN.model.entiteis.competitions;

public interface i_competitionsSRV {

	void addone(competitions competition);

	List<competitions> getAll();

	competitions getone(int id);

	void deleteone(int id);

}