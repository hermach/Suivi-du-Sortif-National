package com.SPN.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SPN.model.DAO.i_journal_santeDAO;
import com.SPN.model.entiteis.journal_sante;

@Service
public class journal_santeSRV implements i_journal_santeSRV {
	@Autowired 
	i_journal_santeDAO dao;
	@Override
	public void addone(journal_sante journal_sante) {
		dao.addone(journal_sante);
	}
	@Override
	public List<journal_sante> getAllJournalSante(int id){
		return dao.getAllJournalSante(id);
	}
	@Override
	public List<journal_sante> getAll(){
		return dao.getAll();
	}
	@Override
	public journal_sante getone(int id) {
		return dao.getone(id);
	}
	@Override
	public void deleteone(int id) {
		dao.deleteone(id);
	}
}
