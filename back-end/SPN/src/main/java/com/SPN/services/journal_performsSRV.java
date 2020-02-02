package com.SPN.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SPN.model.DAO.i_journal_performsDAO;
import com.SPN.model.entiteis.criterr_valeurs;
import com.SPN.model.entiteis.journal_performs;

@Service
public class journal_performsSRV implements i_journal_performsSRV {
	@Autowired 
	i_journal_performsDAO dao;
	@Override
	public void addone(journal_performs journal_perform) {
		dao.addone(journal_perform);
	}
	@Override
	public List<journal_performs> getAll(){
		return dao.getAll();
	}
	@Override
	public List<journal_performs> getAllPerAth(int id){
		return dao.getAllPerAth(id);
	}
	@Override
	public journal_performs getone(int id) {
		return dao.getone(id);
	}
	@Override
	public void deleteone(int id) {
		dao.deleteone(id);
	}
}
