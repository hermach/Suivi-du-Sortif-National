package com.SPN.model.DAO;

import java.util.List;

import com.SPN.model.entiteis.federations;

public interface i_federationsDAO {

	void addAthlet(federations federations);

	List<federations> getAll();

	federations getOne(int id);

	void deleteOne(int id);

}