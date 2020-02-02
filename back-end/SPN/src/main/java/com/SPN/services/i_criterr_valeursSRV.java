package com.SPN.services;

import java.util.List;

import com.SPN.model.entiteis.criterr_valeurs;

public interface i_criterr_valeursSRV {

	void addone(criterr_valeurs criterr_valeur);

	List<criterr_valeurs> getAll();

	criterr_valeurs getone(int id);

	void deleteone(int id);

}