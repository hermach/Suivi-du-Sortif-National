package com.SPN.services;

import java.util.List;

import com.SPN.model.entiteis.journal_sante;

public interface i_journal_santeSRV {

	void addone(journal_sante journal_sante);
	
	List<journal_sante> getAllJournalSante(int id);

	List<journal_sante> getAll();

	journal_sante getone(int id);

	void deleteone(int id);

}