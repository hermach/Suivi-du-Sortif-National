package com.SPN.services;

import java.util.List;

import com.SPN.model.entiteis.athletes;
import com.SPN.model.entiteis.historique_entite;

public interface i_athleteSRV {

	athletes addathlet(athletes athlete, historique_entite historique_entite);

	List<athletes> getAll();

	athletes getone(int id);

	void deleteone(int id);

}