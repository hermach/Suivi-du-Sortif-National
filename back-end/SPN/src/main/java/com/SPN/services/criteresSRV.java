package com.SPN.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SPN.model.DAO.i_criteresDAO;
import com.SPN.model.entiteis.criteres;

@Service
public class criteresSRV implements i_criteresSRV {
	@Autowired 
	i_criteresDAO dao;
	@Override
	public void addone(criteres critere) {
		dao.addone(critere);
	}
	@Override
	public List<criteres> getAll(){
		return dao.getAll();
	}
	@Override
	public List<criteres> getAllcriter_de_sport(int id){
		return dao.getAllcriter_de_sport(id);
	}
	@Override
	public criteres getone(int id) {
		return dao.getone(id);
	}
	@Override
	public void deleteone(int id) {
		dao.deleteone(id);
	}

}
