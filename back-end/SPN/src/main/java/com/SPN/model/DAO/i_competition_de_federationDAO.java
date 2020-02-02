package com.SPN.model.DAO;

import java.util.List;

import com.SPN.model.entiteis.competition_de_federation;
import com.SPN.model.entiteis.competitions;

public interface i_competition_de_federationDAO {

	void add(competition_de_federation competition_de_federation, competitions competition);

	List<competition_de_federation> getAll();
	
	List<competitions> get(int id);

	competition_de_federation getone(int id);

	void deleteone(int id);

}