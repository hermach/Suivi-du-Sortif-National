package com.SPN.model.DAO;

import java.util.List;

import com.SPN.model.entiteis.criterr_valeurs;
import com.SPN.model.entiteis.journal_performs;

public interface i_journal_performsDAO {

	void addone(journal_performs journal_perform);

	List<journal_performs> getAll();

	List<journal_performs> getAllPerAth(int id);
	
	journal_performs getone(int id);

	void deleteone(int id);

}