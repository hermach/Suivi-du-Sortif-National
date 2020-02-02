package com.SPN.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SPN.model.DAO.i_competitionsDAO;
import com.SPN.model.entiteis.competitions;

@Service
public class competitionsSRV implements i_competitionsSRV {
	@Autowired 
	i_competitionsDAO dao;
	@Override
	public void addone(competitions competition) {
		dao.addone(competition);
	}
	@Override
	public List<competitions> getAll(){
		return dao.getAll();
	}
	@Override
	public competitions getone(int id) {
		return dao.getone(id);
	}
	@Override
	public void deleteone(int id) {
		dao.deleteone(id);
	}
}
