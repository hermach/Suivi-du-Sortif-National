package com.SPN.services;

import java.util.List;

import com.SPN.model.entiteis.historique_entite;

public interface i_historique_entiteSRV {

	void addone(historique_entite historique_entite);
	
	List<historique_entite> getAllAthlete(int id);

	List<historique_entite> getAll();

	historique_entite getone(int id);

	void deleteone(int id);

}