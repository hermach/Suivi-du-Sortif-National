package com.SPN.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SPN.model.DAO.i_sportsDAO;
import com.SPN.model.entiteis.sports;

@Service
public class sportsSRV implements i_sportsSRV {
	@Autowired 
	i_sportsDAO dao;
	@Override
	public void addone(sports sport) {
		dao.addone(sport);
	}
	@Override
	public List<sports> getAll(){
		return dao.getAll();
	}
	@Override
	public sports getone(int id) {
		return dao.getone(id);
	}
	@Override
	public void deleteone(int id) {
		dao.deleteone(id);
	}
}
