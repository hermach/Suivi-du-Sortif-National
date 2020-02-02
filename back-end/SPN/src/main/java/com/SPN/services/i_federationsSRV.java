package com.SPN.services;

import java.util.List;

import com.SPN.model.entiteis.federations;

public interface i_federationsSRV {

	void addAthlet(federations federations);

	List<federations> getAll();

	federations getOne(int id);

	void deleteOne(int id);

}