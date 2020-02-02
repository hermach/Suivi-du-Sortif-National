package com.SPN.model.DAO;

import java.util.List;

import com.SPN.model.entiteis.competitions;

public interface i_competitionsDAO {

	void addone(competitions competition);

	List<competitions> getAll();

	competitions getone(int id);

	void deleteone(int id);

}